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
public final class FavoriteViewModel_Factory implements Factory<FavoriteViewModel> {
  private final Provider<BookSearchRepository> bookSearchRepositoryProvider;

  public FavoriteViewModel_Factory(Provider<BookSearchRepository> bookSearchRepositoryProvider) {
    this.bookSearchRepositoryProvider = bookSearchRepositoryProvider;
  }

  @Override
  public FavoriteViewModel get() {
    return newInstance(bookSearchRepositoryProvider.get());
  }

  public static FavoriteViewModel_Factory create(
      Provider<BookSearchRepository> bookSearchRepositoryProvider) {
    return new FavoriteViewModel_Factory(bookSearchRepositoryProvider);
  }

  public static FavoriteViewModel newInstance(BookSearchRepository bookSearchRepository) {
    return new FavoriteViewModel(bookSearchRepository);
  }
}
