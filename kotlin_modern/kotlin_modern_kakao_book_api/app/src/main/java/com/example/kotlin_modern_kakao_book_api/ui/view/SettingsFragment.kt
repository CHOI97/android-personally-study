package com.example.kotlin_modern_kakao_book_api.ui.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.kotlin_modern_kakao_book_api.R
import com.example.kotlin_modern_kakao_book_api.databinding.FragmentSettingsBinding
import com.example.kotlin_modern_kakao_book_api.ui.viewmodel.BookSearchViewModel
import com.example.kotlin_modern_kakao_book_api.util.Sort
import kotlinx.coroutines.launch

class SettingsFragment : Fragment() {
    private var _binding: FragmentSettingsBinding? = null
    private val binding: FragmentSettingsBinding get() = _binding!!

    private lateinit var bookSearchViewModel: BookSearchViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bookSearchViewModel = (activity as MainActivity).bookSearchViewModel

        // Sort State
        saveSettings()
        loadSettings()
        showWorkStatus()
    }

    private fun saveSettings() {
        binding.rgSort.setOnCheckedChangeListener { _, checkedId ->
            val value = when (checkedId) {
                R.id.rb_accuracy -> Sort.Accuracy.value
                R.id.rb_latest -> Sort.LATEST.value
                else -> return@setOnCheckedChangeListener
            }
            bookSearchViewModel.saveSortMode(value)
        }
        binding.swCacheDelete.setOnCheckedChangeListener { _, isChecked ->
            bookSearchViewModel.saveCacheDeleteMode(isChecked)
            if (isChecked) {
                bookSearchViewModel.setWork()
            } else {
                bookSearchViewModel.deleteWork()
            }
        }
    }

    private fun loadSettings() {
        lifecycleScope.launch {
            val buttonId = when (bookSearchViewModel.getSortMode()) {
                Sort.Accuracy.value -> R.id.rb_accuracy
                Sort.LATEST.value -> R.id.rb_latest
                else -> return@launch
            }
            binding.rgSort.check(buttonId)
        }
        lifecycleScope.launch {
            val mode = bookSearchViewModel.getCacheDeleteMode()
            binding.swCacheDelete.isChecked = mode
        }
    }

    private fun showWorkStatus() {
        bookSearchViewModel.getWorkStatus().observe(viewLifecycleOwner) { workInfo ->
            Log.d("WorkManager", workInfo.toString())
            if (workInfo.isEmpty()) {
                binding.tvWorkStatus.text = "No works"
            } else {
                binding.tvWorkStatus.text = workInfo[0].state.toString()
            }
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}