package com.example.elfiliquizapp
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.elfiliquizapp.R
import com.example.elfiliquizapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        // Retrieve data from arguments
        val imageResId = arguments?.getInt("imageResId") ?: R.drawable.ic_launcher_background
        val author = arguments?.getString("author") ?: ""
        val title = arguments?.getString("title") ?: ""
        val content = arguments?.getString("content") ?: ""

        // Set data to views
        binding.imageView.setImageResource(imageResId)
        binding.textTitle.text = title
        binding.textContent.text = content
        // Handle back button press
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Navigate to another fragment when back button is pressed
                val detailFragment = HomeFragment()
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, detailFragment)
                    .addToBackStack(null)
                    .commit()
            }
        })


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
