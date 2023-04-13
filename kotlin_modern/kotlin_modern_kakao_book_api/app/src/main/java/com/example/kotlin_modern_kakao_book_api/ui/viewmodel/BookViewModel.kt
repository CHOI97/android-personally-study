package com.example.kotlin_modern_kakao_book_api.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin_modern_kakao_book_api.data.model.Book
import com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BookViewModel @Inject constructor(
    private val bookSearchRepository: BookSearchRepository,
) : ViewModel() {

    // Room
    fun saveBook(book: Book) = viewModelScope.launch(Dispatchers.IO) {
        bookSearchRepository.insertBook(book)
    }

    // For test
    val favoriteBooks: Flow<List<Book>> = bookSearchRepository.getFavoriteBooks()
}