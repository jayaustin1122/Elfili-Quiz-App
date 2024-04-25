package com.example.elfiliquizapp
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.database.UserDao
import com.example.elfiliquizapp.databinding.FragmentDetailBinding
import com.example.elfiliquizapp.table.QuizQuestion
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.Serializable

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    var mMediaPlayer: MediaPlayer? = null
    private lateinit var userDao: UserDao
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        userDao = ElfiliDatabase.invoke(requireContext()).getUserDao()
        // Retrieve data from arguments
        val imageResId = arguments?.getInt("imageResId") ?: R.drawable.ic_launcher_background
        val author = arguments?.getString("author") ?: ""
        val title = arguments?.getString("title") ?: ""
        val content = arguments?.getString("content") ?: ""
        val position = arguments?.getString("position") ?: ""
        val audioResId = arguments?.getInt("audio") ?: 0
        // Set data to views
        getUserFromDatabase(position)
        binding.imageView.setImageResource(imageResId)
        binding.textTitle.text = title
        binding.textContent.text = content

        binding.play.setOnClickListener {
            playSound(audioResId)
        }
        binding.stop.setOnClickListener {
            stopSound()
        }
        binding.pause.setOnClickListener {
            pauseSound()
        }
        binding.btnQuiz.setOnClickListener {
            val quizQuestions = arguments?.getSerializable("quizQuestions") as? List<QuizQuestion>
            if (quizQuestions != null) {
                val bundle = Bundle().apply {
                    arguments?.getString("position") ?: ""
                    putSerializable("quizQuestions", quizQuestions as Serializable)
                }
                val quizFragment = QuizFragment()
                quizFragment.arguments = bundle
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, quizFragment)
                    .addToBackStack(null)
                    .commit()
            } else {
                // Handle the case where quizQuestions is null or not an instance of List<QuizQuestion>
            }
        }
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_detailFragment2_to_homeFragment)

        }

        return view
    }
    private fun getUserFromDatabase(position: String) {
        lifecycleScope.launch(Dispatchers.IO) {
            val user = userDao.getKabanata(position)
            withContext(Dispatchers.Main) {
                if (user != null) {
                    binding.btnQuiz.isEnabled = user.isBoolean == true
                }

            }
        }
    }
    private fun playSound(audioResId: Int) {
        // Release any existing MediaPlayer instance
        stopSound()
        mMediaPlayer = MediaPlayer.create(requireContext(), audioResId)
        mMediaPlayer?.isLooping = true
        mMediaPlayer?.start()
    }

    // 2. Pause playback
    fun pauseSound() {
        if (mMediaPlayer?.isPlaying == true) mMediaPlayer?.pause()
    }

    // 3. Stops playback
    fun stopSound() {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.stop()
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    // 4. Destroys the MediaPlayer instance when the app is closed
    override fun onStop() {
        super.onStop()
        if (mMediaPlayer != null) {
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
