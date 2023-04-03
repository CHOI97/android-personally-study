package com.example.kotlin_modern_kakao_book_api.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_modern_kakao_book_api.databinding.FragmentFavoriteBinding
import com.example.kotlin_modern_kakao_book_api.ui.adapter.BookSearchAdapter
import com.example.kotlin_modern_kakao_book_api.ui.viewmodel.BookSearchViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class FavoriteFragment : Fragment() {
    private var _binding: FragmentFavoriteBinding? = null
    private val binding: FragmentFavoriteBinding get() = _binding!!

    private lateinit var bookSearchViewModel: BookSearchViewModel
    private lateinit var bookSearchAdapter: BookSearchAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupTouchHelper(view)

        bookSearchViewModel = (activity as MainActivity).bookSearchViewModel
        setupRecyclerView()

        // LiveData -> Flow
//        bookSearchViewModel.favoriteBook.observe(viewLifecycleOwner, Observer {
//            bookSearchAdapter.submitList(it)
//        })
//        lifecycleScope.launch {
//            bookSearchViewModel.favoriteBook.collectLatest {
//                bookSearchAdapter.submitList(it)
//            }
//        }
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                bookSearchViewModel.favoriteBook.collectLatest {
                    bookSearchAdapter.submitList(it)
                }
            }
        }
    }

    private fun setupRecyclerView() {
        bookSearchAdapter = BookSearchAdapter()
        binding.rvFavoriteBooks.apply {
            setHasFixedSize(true)
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            addItemDecoration(
                DividerItemDecoration(
                    requireContext(),
                    DividerItemDecoration.VERTICAL
                )
            )
            adapter = bookSearchAdapter
        }
        bookSearchAdapter.setOnItemClickListener {
            val action = SearchFragmentDirections.actionFragmentSearchToFragmentBook(it)
            findNavController().navigate(action)
        }
    }

    private fun setupTouchHelper(view: View) {
        val itemTouchHelperCallback =
            object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
                override fun onMove(
                    recyclerView: RecyclerView,
                    viewHolder: RecyclerView.ViewHolder,
                    target: RecyclerView.ViewHolder
                ): Boolean {
                    return true
                }

                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                    val position = viewHolder.bindingAdapterPosition
                    val book = bookSearchAdapter.currentList[position]
                    bookSearchViewModel.deleteBook(book)
                    Snackbar.make(view, "Book has deleted", Snackbar.LENGTH_SHORT).apply {
                        setAction("Undo") {
                            bookSearchViewModel.saveBook(book)
                        }.show()
                    }
                }

            }
        ItemTouchHelper(itemTouchHelperCallback).apply {
            attachToRecyclerView(binding.rvFavoriteBooks)
        }
    }

    override
    fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}