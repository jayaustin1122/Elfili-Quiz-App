package com.example.elfiliquizapp

import HomeViewModel2
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.database.KabanataDao
import com.example.elfiliquizapp.database.UserDao
import com.example.elfiliquizapp.databinding.FragmentNavBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class NavFragment : Fragment() {
    private lateinit var binding : FragmentNavBinding
    private lateinit var userDao: UserDao
    private lateinit var fragmentManager: FragmentManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNavBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userDao = ElfiliDatabase.invoke(requireContext()).getUserDao()
        fragmentManager = requireActivity().supportFragmentManager
        displayUser()
        val homeAdminFragment = HomeFragment()
        val searchFragment = SearchFragment()
        val profileFragment = ProfileFragment()
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
        val bottomNavigationView: BottomNavigationView = binding.bottomNavigation
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            val selectedFragment: Fragment = when (item.itemId) {
                R.id.navigation_HomeAdmin -> homeAdminFragment
                R.id.navigation_ViewAll -> searchFragment
                R.id.navigation_profileAdmin -> profileFragment
                else -> return@setOnNavigationItemSelectedListener false
            }
            fragmentManager.beginTransaction()
                .replace(R.id.fragment_containerAdmin, selectedFragment)
                .addToBackStack(null) // Add fragment to back stack
                .commitAllowingStateLoss()// Use commitAllowingStateLoss() to retain fragment state
            true
        }

        if (savedInstanceState == null) {
            // Initially load the HomeFragment only if it's not already added
            if (!homeAdminFragment.isAdded) {
                fragmentManager.beginTransaction()
                    .add(R.id.fragment_containerAdmin, homeAdminFragment)
                    .commit()
            }
            bottomNavigationView.selectedItemId = R.id.navigation_HomeAdmin
        }
    }
    private fun displayUser() {
        lifecycleScope.launch(Dispatchers.IO) {
            // Retrieve the user from the database by position
            val user = userDao.getSingleUser()
            if (user != null) {
                binding.name.text = user.name
            }

        }
    }
}