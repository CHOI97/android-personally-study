package com.example.kotlin_modern_kakao_book_api.ui.viewmodel;

import androidx.lifecycle.SavedStateHandle;
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
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<BookSearchRepository> bookSearchRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public SearchViewModel_Factory(Provider<BookSearchRepository> bookSearchRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.bookSearchRepositoryProvider = bookSearchRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(bookSearchRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static SearchViewModel_Factory create(
      Provider<BookSearchRepository> bookSearchRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new SearchViewModel_Factory(bookSearchRepositoryProvider, savedStateHandleProvider);
  }

  public static SearchViewModel newInstance(BookSearchRepository bookSearchRepository,
      SavedStateHandle savedStateHandle) {
    return new SearchViewModel(bookSearchRepository, savedStateHandle);
  }
}
