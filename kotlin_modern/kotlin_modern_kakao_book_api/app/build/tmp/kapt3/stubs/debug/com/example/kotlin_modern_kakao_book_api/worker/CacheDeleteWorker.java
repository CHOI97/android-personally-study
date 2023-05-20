package com.example.kotlin_modern_kakao_book_api.worker;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/worker/CacheDeleteWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "cacheDeleteResult", "", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ljava/lang/String;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_debug"})
public final class CacheDeleteWorker extends androidx.work.Worker {
    private final java.lang.String cacheDeleteResult = null;
    
    @dagger.assisted.AssistedInject()
    public CacheDeleteWorker(@org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    androidx.work.WorkerParameters workerParams, @org.jetbrains.annotations.NotNull()
    java.lang.String cacheDeleteResult) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
}