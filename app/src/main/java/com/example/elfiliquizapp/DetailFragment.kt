package com.example.elfiliquizapp
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.elfiliquizapp.R
import com.example.elfiliquizapp.databinding.FragmentDetailBinding
import com.example.elfiliquizapp.table.QuizQuestion
import java.io.Serializable

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    var mMediaPlayer: MediaPlayer? = null
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
        val audioResId = arguments?.getInt("audio") ?: 0
        // Set data to views
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

        return view
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
