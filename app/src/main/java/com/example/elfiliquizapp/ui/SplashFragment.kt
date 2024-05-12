package com.example.elfiliquizapp.ui

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.elfiliquizapp.R
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.database.UserDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SplashFragment : Fragment() {

    private lateinit var userDao: UserDao

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        userDao = ElfiliDatabase.invoke(requireContext()).getUserDao()

        Handler().postDelayed({
            checkUserRegistration()
        }, 4000)

        return view
    }

    private fun checkUserRegistration() {
        lifecycleScope.launch(Dispatchers.IO) {
            val users = userDao.getSingleUser()
            if (users != null) {
                // Users are registered, navigate to home screen
                withContext(Dispatchers.Main) {
                    findNavController().navigate(R.id.action_splashFragment_to_navFragment)



                }
            } else {
                // No users registered, insert initial data and navigate to login screen
           //     insertInitialData()
                withContext(Dispatchers.Main) {
                    findNavController().navigate(R.id.action_splashFragment_to_loginFragment)

                }
            }
        }
    }


}
