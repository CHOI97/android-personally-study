package com.example.kotlin_modern_kakao_book_api.ui.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.kotlin_modern_kakao_book_api.databinding.FragmentBookBinding
import com.example.kotlin_modern_kakao_book_api.ui.viewmodel.BookSearchViewModel
import com.google.android.material.snackbar.Snackbar

class BookFragment : Fragment() {
    private var _binding: FragmentBookBinding? = null
    private val binding get() = _binding!!

    private val args by navArgs<BookFragmentArgs>()
    private lateinit var bookSearchViewModel: BookSearchViewModel

    override
    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBookBinding.inflate(inflater, container, false)

        return binding.root
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bookSearchViewModel = (activity as MainActivity).bookSearchViewModel
        val book = args.book
        binding.webview.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
            loadUrl(book.url)
        }

        binding.fabFavorite.setOnClickListener {
            bookSearchViewModel.saveBook(book)
            Snackbar.make(view, "Book has saved", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onPause() {
        binding.webview.onPause()
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        binding.webview.onResume()
    }
}