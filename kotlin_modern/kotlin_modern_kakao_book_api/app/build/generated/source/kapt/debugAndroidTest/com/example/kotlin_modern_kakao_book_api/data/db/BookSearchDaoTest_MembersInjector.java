package com.example.kotlin_modern_kakao_book_api.data.db;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import javax.inject.Provider;

@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BookSearchDaoTest_MembersInjector implements MembersInjector<BookSearchDaoTest> {
  private final Provider<BookSearchDatabase> databaseProvider;

  public BookSearchDaoTest_MembersInjector(Provider<BookSearchDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  public static MembersInjector<BookSearchDaoTest> create(
      Provider<BookSearchDatabase> databaseProvider) {
    return new BookSearchDaoTest_MembersInjector(databaseProvider);
  }

  @Override
  public void injectMembers(BookSearchDaoTest instance) {
    injectDatabase(instance, databaseProvider.get());
  }

  @InjectedFieldSignature("com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDaoTest.database")
  @Named("test_db")
  public static void injectDatabase(BookSearchDaoTest instance, BookSearchDatabase database) {
    instance.database = database;
  }
}
