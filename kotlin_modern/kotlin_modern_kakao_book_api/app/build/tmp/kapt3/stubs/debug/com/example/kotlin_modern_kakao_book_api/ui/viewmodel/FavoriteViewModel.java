package com.example.kotlin_modern_kakao_book_api.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;
import com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/viewmodel/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "bookSearchRepository", "Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchRepository;", "(Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchRepository;)V", "favoritePagingBooks", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/paging/PagingData;", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "getFavoritePagingBooks", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteBook", "Lkotlinx/coroutines/Job;", "book", "saveBook", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository bookSearchRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.example.kotlin_modern_kakao_book_api.data.model.Book>> favoritePagingBooks = null;
    
    @javax.inject.Inject
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository bookSearchRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.example.kotlin_modern_kakao_book_api.data.model.Book>> getFavoritePagingBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job saveBook(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.model.Book book) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteBook(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.model.Book book) {
        return null;
    }
}