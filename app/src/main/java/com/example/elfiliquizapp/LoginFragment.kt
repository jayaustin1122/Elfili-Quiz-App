package com.example.elfiliquizapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.database.UserDao
import com.example.elfiliquizapp.databinding.FragmentLoginBinding
import com.example.elfiliquizapp.table.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class LoginFragment : Fragment() {
    private lateinit var binding : FragmentLoginBinding
    private lateinit var userDao: UserDao
    private lateinit var database: ElfiliDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        database = ElfiliDatabase(requireContext())
        userDao = database.getUserDao()

        binding.btnLogin.setOnClickListener {
            val username = binding.etFullname.text.toString().trim()
            if (username.isNotEmpty()) {
                // Save the username into the database
                lifecycleScope.launch(Dispatchers.IO) {
                    userDao.insertUser(User(name = username, number = 99, position = "99", isBoolean = false))
                    withContext(Dispatchers.Main) {
                        // This code block will execute on the main thread
                        Log.d("LoginFragment", "User inserted successfully: $username")
                        // Navigate to the home fragment
                        findNavController().navigate(R.id.action_loginFragment_to_navFragment)
                    }
                }
            }
        }


    }
}
