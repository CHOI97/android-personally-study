package com.example.kotlin_modern_kakao_book_api.data.repository;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.example.kotlin_modern_kakao_book_api.data.api.BookSearchApi;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0016\u00a2\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "api", "Lcom/example/kotlin_modern_kakao_book_api/data/api/BookSearchApi;", "query", "", "sort", "(Lcom/example/kotlin_modern_kakao_book_api/data/api/BookSearchApi;Ljava/lang/String;Ljava/lang/String;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class BookSearchPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.example.kotlin_modern_kakao_book_api.data.model.Book> {
    private final com.example.kotlin_modern_kakao_book_api.data.api.BookSearchApi api = null;
    private final java.lang.String query = null;
    private final java.lang.String sort = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchPagingSource.Companion Companion = null;
    public static final int STARTING_PAGE_INDEX = 1;
    
    public BookSearchPagingSource(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.api.BookSearchApi api, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    java.lang.String sort) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.example.kotlin_modern_kakao_book_api.data.model.Book>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, com.example.kotlin_modern_kakao_book_api.data.model.Book> state) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchPagingSource$Companion;", "", "()V", "STARTING_PAGE_INDEX", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}