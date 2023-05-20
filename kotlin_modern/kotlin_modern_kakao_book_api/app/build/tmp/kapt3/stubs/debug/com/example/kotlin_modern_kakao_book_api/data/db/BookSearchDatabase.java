package com.example.kotlin_modern_kakao_book_api.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;

@androidx.room.TypeConverters(value = {com.example.kotlin_modern_kakao_book_api.data.db.OrmConverter.class})
@androidx.room.Database(entities = {com.example.kotlin_modern_kakao_book_api.data.model.Book.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDatabase;", "Landroidx/room/RoomDatabase;", "()V", "bookSearchDao", "Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDao;", "Companion", "app_debug"})
public abstract class BookSearchDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase INSTANCE;
    
    public BookSearchDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDao bookSearchDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/kotlin_modern_kakao_book_api/data/db/BookSearchDatabase;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}