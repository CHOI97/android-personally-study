package com.example.kotlin_modern_kakao_book_api.ui.view;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;
import kotlin.Suppress;
import kotlin.jvm.JvmStatic;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/view/BookFragmentArgs;", "Landroidx/navigation/NavArgs;", "book", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "(Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;)V", "getBook", "()Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "toString", "", "Companion", "app_debug"})
public final class BookFragmentArgs implements androidx.navigation.NavArgs {
    @org.jetbrains.annotations.NotNull
    private final com.example.kotlin_modern_kakao_book_api.data.model.Book book = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlin_modern_kakao_book_api.ui.view.BookFragmentArgs.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlin_modern_kakao_book_api.ui.view.BookFragmentArgs copy(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.model.Book book) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public BookFragmentArgs(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.model.Book book) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlin_modern_kakao_book_api.data.model.Book component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.kotlin_modern_kakao_book_api.data.model.Book getBook() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
    public final android.os.Bundle toBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
    public final androidx.lifecycle.SavedStateHandle toSavedStateHandle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"DEPRECATION"})
    @kotlin.jvm.JvmStatic
    public static final com.example.kotlin_modern_kakao_book_api.ui.view.BookFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final com.example.kotlin_modern_kakao_book_api.ui.view.BookFragmentArgs fromSavedStateHandle(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/view/BookFragmentArgs$Companion;", "", "()V", "fromBundle", "Lcom/example/kotlin_modern_kakao_book_api/ui/view/BookFragmentArgs;", "bundle", "Landroid/os/Bundle;", "fromSavedStateHandle", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"DEPRECATION"})
        @kotlin.jvm.JvmStatic
        public final com.example.kotlin_modern_kakao_book_api.ui.view.BookFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull
        android.os.Bundle bundle) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public final com.example.kotlin_modern_kakao_book_api.ui.view.BookFragmentArgs fromSavedStateHandle(@org.jetbrains.annotations.NotNull
        androidx.lifecycle.SavedStateHandle savedStateHandle) {
            return null;
        }
    }
}