package com.example.kotlin_modern_kakao_book_api.ui.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;
import com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0016\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/viewmodel/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "bookSearchRepository", "Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_searchPagingResult", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "value", "", "query", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "searchPagingResult", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchPagingResult", "()Lkotlinx/coroutines/flow/StateFlow;", "getSortMode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchBooksPaging", "", "Companion", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository bookSearchRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.kotlin_modern_kakao_book_api.data.model.Book>> _searchPagingResult = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.example.kotlin_modern_kakao_book_api.data.model.Book>> searchPagingResult = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String query;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kotlin_modern_kakao_book_api.ui.viewmodel.SearchViewModel.Companion Companion = null;
    private static final java.lang.String SAVE_STATE_KEY = "query";
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository bookSearchRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.example.kotlin_modern_kakao_book_api.data.model.Book>> getSearchPagingResult() {
        return null;
    }
    
    public final void searchBooksPaging(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSortMode(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/viewmodel/SearchViewModel$Companion;", "", "()V", "SAVE_STATE_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}