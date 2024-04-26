package com.example.elfiliquizapp

import HomeViewModel2
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.addCallback
import androidx.core.content.edit
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.database.KabanataDao
import com.example.elfiliquizapp.database.UserDao
import com.example.elfiliquizapp.databinding.FragmentHomeBinding
import com.example.elfiliquizapp.model.Datas
import com.example.elfiliquizapp.model.Kabanata
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.Serializable

class HomeFragment : Fragment(),Myadapter2.OnItemClickListener2  {
    private lateinit var _binding: FragmentHomeBinding
    private lateinit var userDao: UserDao
    private val homeViewModel2: HomeViewModel2 by viewModels()
    private lateinit var adapter2: Myadapter2
    private lateinit var kabanataDao: KabanataDao
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater)
        return _binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        userDao = ElfiliDatabase.invoke(requireContext()).getUserDao()
        kabanataDao = ElfiliDatabase.invoke(requireContext()).getKabanata()
        sharedPreferences = requireContext().getSharedPreferences(
            "com.example.elfiliquizapp.PREFERENCE_FILE_KEY",
            Context.MODE_PRIVATE
        )

        displayUser()
        // Initialize RecyclerView adapter
        adapter2 = Myadapter2(requireContext())
        adapter2.setOnItemClickListener(this)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {

        }
        // Set RecyclerView adapter
        _binding.cropRecycler1.adapter = adapter2
        // Set GridLayoutManager with 2 spans
        _binding.cropRecycler1.layoutManager = GridLayoutManager(requireContext(), 2)

        // Observe dataList from ViewModel
        homeViewModel2.dataList.observe(viewLifecycleOwner, Observer {
            adapter2.setDataList(it)
        })

        // Query the user's name
        GlobalScope.launch(Dispatchers.IO) {
            val currentUser = userDao.getSingleUser()
            currentUser?.let {
                // Switch to the main thread to update UI
                withContext(Dispatchers.Main) {
                    _binding.name.text = currentUser.name
                }
            }
        }
        if (!sharedPreferences.getBoolean("INITIAL_DATA_INSERTED", false)) {
            insertInitialData()
            sharedPreferences.edit {
                putBoolean("INITIAL_DATA_INSERTED", true)
            }
        }


    }
    private fun insertInitialData() {
        lifecycleScope.launch(Dispatchers.IO) {
            for (i in 0..38) {
                val kabanata = Kabanata(number = i, isBoolean = false )
                kabanataDao.insertKabanata(kabanata)
                Log.d("HomeFragment", "User inserted successfully: $i")
            }
        }
    }

    override fun onItemClick2(position: Int, data: Datas) {
        // Navigate to new fragment and pass data
        val bundle = Bundle().apply {
            putInt("imageResId", data.imageResId)
            putString("title", getString(data.titleResId))
            putString("position", position.toString())
            Toast.makeText(requireContext(),"$position",Toast.LENGTH_SHORT).show()
            putString("content", getString(data.contentResId))
            putInt("audio", data.audioResId)
            putSerializable("quizQuestions", data.quizQuestions as Serializable) // Pass quiz questions
        }
        val detailFragment = DetailFragment()
        detailFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, detailFragment)
            .addToBackStack(null)
            .commit()
    }
    private fun displayUser() {
        lifecycleScope.launch(Dispatchers.IO) {
            // Retrieve the user from the database by position
            val user = userDao.getSingleUser()
            if (user != null) {
                _binding.name.text = user.name
            }

        }
    }
}
