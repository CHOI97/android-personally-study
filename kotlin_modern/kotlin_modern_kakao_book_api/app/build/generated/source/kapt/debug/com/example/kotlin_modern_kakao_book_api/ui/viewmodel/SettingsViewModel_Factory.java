package com.example.kotlin_modern_kakao_book_api.ui.viewmodel;

import androidx.work.WorkManager;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<BookSearchRepository> bookSearchRepositoryProvider;

  private final Provider<WorkManager> workManagerProvider;

  public SettingsViewModel_Factory(Provider<BookSearchRepository> bookSearchRepositoryProvider,
      Provider<WorkManager> workManagerProvider) {
    this.bookSearchRepositoryProvider = bookSearchRepositoryProvider;
    this.workManagerProvider = workManagerProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(bookSearchRepositoryProvider.get(), workManagerProvider.get());
  }

  public static SettingsViewModel_Factory create(
      Provider<BookSearchRepository> bookSearchRepositoryProvider,
      Provider<WorkManager> workManagerProvider) {
    return new SettingsViewModel_Factory(bookSearchRepositoryProvider, workManagerProvider);
  }

  public static SettingsViewModel newInstance(BookSearchRepository bookSearchRepository,
      WorkManager workManager) {
    return new SettingsViewModel(bookSearchRepository, workManager);
  }
}
