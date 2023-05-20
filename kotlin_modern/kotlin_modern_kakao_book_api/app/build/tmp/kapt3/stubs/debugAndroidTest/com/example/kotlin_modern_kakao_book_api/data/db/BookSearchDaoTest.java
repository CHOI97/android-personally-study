package com.example.kotlin_modern_kakao_book_api.data.db;

import androidx.test.filters.SmallTest;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;
import dagger.hilt.android.testing.HiltAndroidRule;
import dagger.hilt.android.testing.HiltAndroidTest;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import javax.inject.Inject;
import javax.inject.Named;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0007J\f\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0007J\b\u0010\u0016\u001a\u00020\u0013H\u0007J\b\u0010\u0017\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00020\r8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDaoTest;", "", "()V", "dao", "Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDao;", "database", "Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDatabase;", "getDatabase$annotations", "getDatabase", "()Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDatabase;", "setDatabase", "(Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDatabase;)V", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "delete_book_to_db", "", "Lkotlinx/coroutines/test/TestResult;", "insert_book_to_db", "setUp", "tearDown", "app_debug"})
@androidx.test.filters.SmallTest()
@dagger.hilt.android.testing.HiltAndroidTest()
public final class BookSearchDaoTest {
    @javax.inject.Inject()
    public com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase database;
    private com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDao dao;
    @org.jetbrains.annotations.NotNull()
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    
    public BookSearchDaoTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase getDatabase() {
        return null;
    }
    
    @javax.inject.Named(value = "test_db")
    @java.lang.Deprecated()
    public static void getDatabase$annotations() {
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final dagger.hilt.android.testing.HiltAndroidRule getHiltRule() {
        return null;
    }
    
    public final void setHiltRule(@org.jetbrains.annotations.NotNull()
    dagger.hilt.android.testing.HiltAndroidRule p0) {
    }
    
    @org.junit.Before()
    public final void setUp() {
    }
    
    @org.junit.After()
    public final void tearDown() {
    }
    
    @org.junit.Test()
    public final void insert_book_to_db() {
    }
    
    @org.junit.Test()
    public final void delete_book_to_db() {
    }
}