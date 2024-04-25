package com.example.elfiliquizapp

import HomeViewModel2
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.database.UserDao
import com.example.elfiliquizapp.databinding.FragmentHomeBinding
import com.example.elfiliquizapp.model.Datas
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.Serializable

class HomeFragment : Fragment(),Myadapter2.OnItemClickListener2  {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var userDao: UserDao
    private val homeViewModel2: HomeViewModel2 by viewModels()
    private lateinit var adapter2: Myadapter2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        userDao = ElfiliDatabase.invoke(requireContext()).getUserDao()

        // Initialize RecyclerView adapter
        adapter2 = Myadapter2(requireContext())
        adapter2.setOnItemClickListener(this)

        // Set RecyclerView adapter
        binding.cropRecycler1.adapter = adapter2
        // Set GridLayoutManager with 2 spans
        binding.cropRecycler1.layoutManager = GridLayoutManager(requireContext(), 2)

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
                    binding.name.text = currentUser.name
                }
            }
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClick2(data: Datas) {
        // Navigate to new fragment and pass data
        val bundle = Bundle().apply {
            putInt("imageResId", data.imageResId)
            putString("title", getString(data.titleResId))
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

}
