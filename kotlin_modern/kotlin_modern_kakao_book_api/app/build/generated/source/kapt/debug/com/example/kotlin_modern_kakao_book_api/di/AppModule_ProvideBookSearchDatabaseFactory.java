package com.example.kotlin_modern_kakao_book_api.di;

import android.content.Context;
import com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideBookSearchDatabaseFactory implements Factory<BookSearchDatabase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideBookSearchDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public BookSearchDatabase get() {
    return provideBookSearchDatabase(contextProvider.get());
  }

  public static AppModule_ProvideBookSearchDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvideBookSearchDatabaseFactory(contextProvider);
  }

  public static BookSearchDatabase provideBookSearchDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBookSearchDatabase(context));
  }
}
