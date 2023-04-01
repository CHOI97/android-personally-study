package com.example.kotlin_modern_kakao_book_api.data.repository

import androidx.lifecycle.LiveData
import com.example.kotlin_modern_kakao_book_api.data.api.RetrofitInstance.api
import com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase
import com.example.kotlin_modern_kakao_book_api.data.model.Book
import com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse
import retrofit2.Response

class BookSearchRepositoryImpl(
    private val db: BookSearchDatabase
) : BookSearchRepository {

    override suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int
    ): Response<SearchResponse> {
        return api.searchBooks(query, sort, page, size)
    }

    override suspend fun insertBook(book: Book) {
        db.bookSearchDao().insertBook(book)
    }

    override suspend fun deleteBook(book: Book) {
        db.bookSearchDao().deleteBook(book)
    }

    override fun getFavoriteBooks(): LiveData<List<Book>> {
        return db.bookSearchDao().getFavoriteBooks()
    }
}