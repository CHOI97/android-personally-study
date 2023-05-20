package com.example.kotlin_modern_kakao_book_api.ui.viewmodel;

import com.example.kotlin_modern_kakao_book_api.data.repository.BookSearchRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class BookViewModel_Factory implements Factory<BookViewModel> {
  private final Provider<BookSearchRepository> bookSearchRepositoryProvider;

  public BookViewModel_Factory(Provider<BookSearchRepository> bookSearchRepositoryProvider) {
    this.bookSearchRepositoryProvider = bookSearchRepositoryProvider;
  }

  @Override
  public BookViewModel get() {
    return newInstance(bookSearchRepositoryProvider.get());
  }

  public static BookViewModel_Factory create(
      Provider<BookSearchRepository> bookSearchRepositoryProvider) {
    return new BookViewModel_Factory(bookSearchRepositoryProvider);
  }

  public static BookViewModel newInstance(BookSearchRepository bookSearchRepository) {
    return new BookViewModel(bookSearchRepository);
  }
}
