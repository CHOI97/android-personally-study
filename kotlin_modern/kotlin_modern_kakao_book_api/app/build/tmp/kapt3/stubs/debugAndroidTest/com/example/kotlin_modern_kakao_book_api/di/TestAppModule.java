package com.example.kotlin_modern_kakao_book_api.di;

import android.content.Context;
import androidx.room.Room;
import com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Named;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/di/TestAppModule;", "", "()V", "provideInMemoryDb", "Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDatabase;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class TestAppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kotlin_modern_kakao_book_api.di.TestAppModule INSTANCE = null;
    
    private TestAppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "test_db")
    @dagger.Provides()
    public final com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase provideInMemoryDb(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
}