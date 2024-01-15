package com.example.kotlin_modern_kakao_book_api.data.api;

import com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/api/BookSearchApi;", "", "searchBooks", "Lretrofit2/Response;", "Lcom/example/kotlin_modern_kakao_book_api/data/model/SearchResponse;", "query", "", "sort", "page", "", "size", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface BookSearchApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/v3/search/book")
    @retrofit2.http.Headers(value = {})
    public abstract java.lang.Object searchBooks(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "sort")
    java.lang.String sort, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "size")
    int size, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse>> continuation);
}