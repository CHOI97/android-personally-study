package com.example.kotlin_modern_kakao_book_api.ui.viewmodel

import androidx.test.filters.MediumTest
import com.example.kotlin_modern_kakao_book_api.data.model.Book
import com.example.kotlin_modern_kakao_book_api.data.repository.FakeBookSearchRepository
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

@MediumTest
class BookViewModelTest {
    private lateinit var viewModel: BookViewModel

    @Before
    fun setUp() {
        viewModel = BookViewModel(FakeBookSearchRepository())
    }

    @Test
    @ExperimentalCoroutinesApi
    fun save_book_test() = runTest {
        val book = Book(
            listOf("a"), "b", "c", "d", 0, "e",
            0, "f", "g", "h", listOf("i"), "j"
        )
        viewModel.saveBook(book)
        val favoriteBooks = viewModel.favoriteBooks.first()
        assertThat(favoriteBooks).contains(book)
    }
}