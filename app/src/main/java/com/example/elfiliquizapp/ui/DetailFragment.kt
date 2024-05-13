package com.example.elfiliquizapp.ui
import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.elfiliquizapp.R
import com.example.elfiliquizapp.database.ElfiliDatabase
import com.example.elfiliquizapp.database.KabanataDao
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
    private lateinit var kabanataDao: KabanataDao


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        userDao = ElfiliDatabase.invoke(requireContext()).getUserDao()
        kabanataDao = ElfiliDatabase.invoke(requireContext()).getKabanata()
        // Retrieve data from arguments
        val imageResId = arguments?.getInt("imageResId") ?: R.drawable.ic_launcher_background
        val author = arguments?.getString("author") ?: ""
        val title = arguments?.getString("title") ?: ""
        val content = arguments?.getString("content") ?: ""
        val position = arguments?.getString("position") ?: ""
        val audioResId = arguments?.getInt("audio") ?: 0
        val taken = arguments?.getBoolean("taken") ?: false
        // Set data to views
        getKabanataFromPosition(position.toInt())
        binding.imageView.setImageResource(imageResId)
        binding.textTitle.text = title
        binding.textContent.text = content
        controlSound(audioResId)

        binding.btnQuiz.setOnClickListener {
            val quizQuestions = arguments?.getSerializable("quizQuestions") as? List<QuizQuestion>
            if (quizQuestions != null) {
                val bundle = Bundle().apply {
                    arguments?.getString("position") ?: ""
                    putSerializable("quizQuestions", quizQuestions as Serializable)
                    putString("position",position)
                    putBoolean("taken", taken)
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
            if (mMediaPlayer != null) {
                mMediaPlayer?.stop()
                mMediaPlayer?.reset()
                mMediaPlayer?.release()
                mMediaPlayer = null
            }

            findNavController().navigateUp()

        }


        return view
    }

    @SuppressLint("SuspiciousIndentation")
    private fun controlSound(audioResId: Int) {
        binding.play.setOnClickListener {
            if (mMediaPlayer == null){
                mMediaPlayer = MediaPlayer.create(requireContext(),audioResId)

                initialSeekbar()
            }
            mMediaPlayer?.start()
        }
        binding.pause.setOnClickListener {
            if (mMediaPlayer !== null) mMediaPlayer?.pause()
        }
        binding.stop.setOnClickListener {
            if (mMediaPlayer !== null)
                mMediaPlayer?.stop()
                mMediaPlayer?.reset()
                mMediaPlayer?.release()
                mMediaPlayer = null
        }
        binding.sekkbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) mMediaPlayer?.seekTo(progress)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

    }

    private fun initialSeekbar() {
        mMediaPlayer?.let {
            binding.sekkbar.max = it.duration
        }
        val handler = Handler()
        handler.postDelayed(object : Runnable{
            override fun run() {
                try {
                    binding.sekkbar.progress = mMediaPlayer!!.currentPosition
                    handler.postDelayed(this,1000)

                }catch (e:Exception){
                    binding.sekkbar.progress = 0
                }


            }

        },0)
    }

    private fun getKabanataFromPosition(position: Int) {
        lifecycleScope.launch(Dispatchers.IO) {
            val user = kabanataDao.getKabanata(position)
            withContext(Dispatchers.Main) {
                if (user != null) {
                    binding.btnQuiz.isEnabled = user.isBoolean == false
                }

            }
        }
    }



}
