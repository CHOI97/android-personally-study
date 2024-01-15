package com.example.kotlin_modern_kakao_book_api.data.db;

import androidx.paging.PagingSource;
import androidx.room.*;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDao;", "", "deleteBook", "", "book", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "(Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteBooks", "Lkotlinx/coroutines/flow/Flow;", "", "getFavoritePagingBooks", "Landroidx/paging/PagingSource;", "", "insertBook", "app_debug"})
public abstract interface BookSearchDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertBook(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.model.Book book, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteBook(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.model.Book book, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM books")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.kotlin_modern_kakao_book_api.data.model.Book>> getFavoriteBooks();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM books")
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.example.kotlin_modern_kakao_book_api.data.model.Book> getFavoritePagingBooks();
}