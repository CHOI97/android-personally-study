package com.example.kotlin_modern_kakao_book_api.di;

import com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository;
import com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepositoryImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/di/RepositoryModule;", "", "()V", "bindBookSearchRepository", "Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchRepository;", "bookSearchRepositoryImpl", "Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchRepositoryImpl;", "app_debug"})
@dagger.Module
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    @javax.inject.Singleton
    public abstract com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository bindBookSearchRepository(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepositoryImpl bookSearchRepositoryImpl);
}