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

@ScopeMetadata
@QualifierMetadata({
    "javax.inject.Named",
    "dagger.hilt.android.qualifiers.ApplicationContext"
})
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TestAppModule_ProvideInMemoryDbFactory implements Factory<BookSearchDatabase> {
  private final Provider<Context> contextProvider;

  public TestAppModule_ProvideInMemoryDbFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public BookSearchDatabase get() {
    return provideInMemoryDb(contextProvider.get());
  }

  public static TestAppModule_ProvideInMemoryDbFactory create(Provider<Context> contextProvider) {
    return new TestAppModule_ProvideInMemoryDbFactory(contextProvider);
  }

  public static BookSearchDatabase provideInMemoryDb(Context context) {
    return Preconditions.checkNotNullFromProvides(TestAppModule.INSTANCE.provideInMemoryDb(context));
  }
}
