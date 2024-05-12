package com.example.elfiliquizapp.ui

import com.example.elfiliquizapp.viewmodels.HomeViewModel2
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.elfiliquizapp.R
import com.example.elfiliquizapp.adapter.Myadapter2
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.database.KabanataDao
import com.example.elfiliquizapp.database.UserDao
import com.example.elfiliquizapp.databinding.FragmentHomeBinding
import com.example.elfiliquizapp.model.Datas
import java.io.Serializable

class HomeFragment : Fragment(), Myadapter2.OnItemClickListener2  {
    private lateinit var _binding: FragmentHomeBinding
    private lateinit var userDao: UserDao
    private val homeViewModel2: HomeViewModel2 by viewModels()
    private lateinit var adapter2: Myadapter2
    private lateinit var kabanataDao: KabanataDao

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return _binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        userDao = ElfiliDatabase.invoke(requireContext()).getUserDao()
        kabanataDao = ElfiliDatabase.invoke(requireContext()).getKabanata()


        // Initialize RecyclerView adapter
        adapter2 = Myadapter2(requireContext())
        adapter2.setOnItemClickListener(this)

        // Set RecyclerView adapter
        _binding.cropRecycler1.adapter = adapter2
        // Set GridLayoutManager with 2 spans
        _binding.cropRecycler1.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);

        // Observe dataList from ViewModel
        homeViewModel2.dataList.observe(viewLifecycleOwner, Observer {
            adapter2.setDataList(it)
        })
        _binding.search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let { homeViewModel2.filterData(requireContext(), it) }
                return true
            }
        })

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
        findNavController().navigate(R.id.action_navFragment_to_detailFragment, bundle)

    }

}