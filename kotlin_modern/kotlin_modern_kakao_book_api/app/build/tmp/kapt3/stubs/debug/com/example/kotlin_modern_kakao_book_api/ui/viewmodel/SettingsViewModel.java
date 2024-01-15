package com.example.kotlin_modern_kakao_book_api.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.work.*;
import com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository;
import com.example.kotlin_modern_kakao_book_api.worker.CacheDeleteWorker;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0011\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/viewmodel/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "bookSearchRepository", "Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchRepository;", "workManager", "Landroidx/work/WorkManager;", "(Lcom/example/kotlin_modern_kakao_book_api/data/repository/BookSearchRepository;Landroidx/work/WorkManager;)V", "deleteWork", "Landroidx/work/Operation;", "getCacheDeleteMode", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSortMode", "", "getWorkStatus", "Landroidx/lifecycle/LiveData;", "", "Landroidx/work/WorkInfo;", "saveCacheDeleteMode", "Lkotlinx/coroutines/Job;", "value", "saveSortMode", "setWork", "", "Companion", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository bookSearchRepository = null;
    private final androidx.work.WorkManager workManager = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.kotlin_modern_kakao_book_api.ui.viewmodel.SettingsViewModel.Companion Companion = null;
    private static final java.lang.String WORKER_KEY = "cache_worker";
    
    @javax.inject.Inject
    public SettingsViewModel(@org.jetbrains.annotations.NotNull
    com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository bookSearchRepository, @org.jetbrains.annotations.NotNull
    androidx.work.WorkManager workManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job saveSortMode(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSortMode(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job saveCacheDeleteMode(boolean value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCacheDeleteMode(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    public final void setWork() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.work.Operation deleteWork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkStatus() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/viewmodel/SettingsViewModel$Companion;", "", "()V", "WORKER_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}