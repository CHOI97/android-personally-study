package com.example.kotlin_modern_kakao_book_api.data.repository;

import androidx.paging.PagingData;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;
import com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse;
import kotlinx.coroutines.flow.Flow;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\bH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\bH&J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ$\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\b2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchRepository;", "", "deleteBook", "", "book", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "(Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheDeleteMode", "Lkotlinx/coroutines/flow/Flow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteBooks", "", "getFavoritePagingBooks", "Landroidx/paging/PagingData;", "getSortMode", "", "insertBook", "saveCacheDeleteMode", "mode", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSortMode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchBooks", "Lretrofit2/Response;", "Lcom/example/kotlin_modern_kakao_book_api/data/model/SearchResponse;", "query", "sort", "page", "", "size", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchBooksPaging", "app_debug"})
public abstract interface BookSearchRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchBooks(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String sort, int page, int size, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertBook(@org.jetbrains.annotations.NotNull()
    com.example.kotlin_modern_kakao_book_api.data.model.Book book, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteBook(@org.jetbrains.annotations.NotNull()
    com.example.kotlin_modern_kakao_book_api.data.model.Book book, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.kotlin_modern_kakao_book_api.data.model.Book>> getFavoriteBooks();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveSortMode(@org.jetbrains.annotations.NotNull()
    java.lang.String mode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSortMode(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCacheDeleteMode(boolean mode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCacheDeleteMode(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kotlin_modern_kakao_book_api.data.model.Book>> getFavoritePagingBooks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kotlin_modern_kakao_book_api.data.model.Book>> searchBooksPaging(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String sort);
}