package com.example.kotlin_modern_kakao_book_api.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideCacheDeleteResultFactory implements Factory<String> {
  @Override
  public String get() {
    return provideCacheDeleteResult();
  }

  public static AppModule_ProvideCacheDeleteResultFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provideCacheDeleteResult() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCacheDeleteResult());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideCacheDeleteResultFactory INSTANCE = new AppModule_ProvideCacheDeleteResultFactory();
  }
}
