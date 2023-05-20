package com.example.kotlin_modern_kakao_book_api.data.repository;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.example.kotlin_modern_kakao_book_api.data.api.BookSearchApi;
import com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class BookSearchRepositoryImpl_Factory implements Factory<BookSearchRepositoryImpl> {
  private final Provider<BookSearchDatabase> dbProvider;

  private final Provider<DataStore<Preferences>> dataStoreProvider;

  private final Provider<BookSearchApi> apiProvider;

  public BookSearchRepositoryImpl_Factory(Provider<BookSearchDatabase> dbProvider,
      Provider<DataStore<Preferences>> dataStoreProvider, Provider<BookSearchApi> apiProvider) {
    this.dbProvider = dbProvider;
    this.dataStoreProvider = dataStoreProvider;
    this.apiProvider = apiProvider;
  }

  @Override
  public BookSearchRepositoryImpl get() {
    return newInstance(dbProvider.get(), dataStoreProvider.get(), apiProvider.get());
  }

  public static BookSearchRepositoryImpl_Factory create(Provider<BookSearchDatabase> dbProvider,
      Provider<DataStore<Preferences>> dataStoreProvider, Provider<BookSearchApi> apiProvider) {
    return new BookSearchRepositoryImpl_Factory(dbProvider, dataStoreProvider, apiProvider);
  }

  public static BookSearchRepositoryImpl newInstance(BookSearchDatabase db,
      DataStore<Preferences> dataStore, BookSearchApi api) {
    return new BookSearchRepositoryImpl(db, dataStore, api);
  }
}
