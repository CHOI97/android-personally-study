package com.example.kotlin_modern_kakao_book_api.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CacheDeleteWorker_Factory {
  private final Provider<String> cacheDeleteResultProvider;

  public CacheDeleteWorker_Factory(Provider<String> cacheDeleteResultProvider) {
    this.cacheDeleteResultProvider = cacheDeleteResultProvider;
  }

  public CacheDeleteWorker get(Context context, WorkerParameters workerParams) {
    return newInstance(context, workerParams, cacheDeleteResultProvider.get());
  }

  public static CacheDeleteWorker_Factory create(Provider<String> cacheDeleteResultProvider) {
    return new CacheDeleteWorker_Factory(cacheDeleteResultProvider);
  }

  public static CacheDeleteWorker newInstance(Context context, WorkerParameters workerParams,
      String cacheDeleteResult) {
    return new CacheDeleteWorker(context, workerParams, cacheDeleteResult);
  }
}
