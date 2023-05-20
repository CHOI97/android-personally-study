package com.example.kotlin_modern_kakao_book_api.di;

import com.example.kotlin_modern_kakao_book_api.data.api.BookSearchApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class AppModule_ProvideApiServiceFactory implements Factory<BookSearchApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public BookSearchApi get() {
    return provideApiService(retrofitProvider.get());
  }

  public static AppModule_ProvideApiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideApiServiceFactory(retrofitProvider);
  }

  public static BookSearchApi provideApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApiService(retrofit));
  }
}
