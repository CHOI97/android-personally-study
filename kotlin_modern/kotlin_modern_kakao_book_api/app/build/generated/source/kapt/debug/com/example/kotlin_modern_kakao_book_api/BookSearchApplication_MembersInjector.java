package com.example.kotlin_modern_kakao_book_api;

import androidx.hilt.work.HiltWorkerFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class BookSearchApplication_MembersInjector implements MembersInjector<BookSearchApplication> {
  private final Provider<HiltWorkerFactory> workerFactoryProvider;

  public BookSearchApplication_MembersInjector(Provider<HiltWorkerFactory> workerFactoryProvider) {
    this.workerFactoryProvider = workerFactoryProvider;
  }

  public static MembersInjector<BookSearchApplication> create(
      Provider<HiltWorkerFactory> workerFactoryProvider) {
    return new BookSearchApplication_MembersInjector(workerFactoryProvider);
  }

  @Override
  public void injectMembers(BookSearchApplication instance) {
    injectWorkerFactory(instance, workerFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.kotlin_modern_kakao_book_api.BookSearchApplication.workerFactory")
  public static void injectWorkerFactory(BookSearchApplication instance,
      HiltWorkerFactory workerFactory) {
    instance.workerFactory = workerFactory;
  }
}
