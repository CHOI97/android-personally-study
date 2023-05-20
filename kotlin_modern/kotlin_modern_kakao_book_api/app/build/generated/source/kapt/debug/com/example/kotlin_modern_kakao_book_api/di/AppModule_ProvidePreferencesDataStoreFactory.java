package com.example.kotlin_modern_kakao_book_api.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
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
public final class AppModule_ProvidePreferencesDataStoreFactory implements Factory<DataStore<Preferences>> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvidePreferencesDataStoreFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStore<Preferences> get() {
    return providePreferencesDataStore(contextProvider.get());
  }

  public static AppModule_ProvidePreferencesDataStoreFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvidePreferencesDataStoreFactory(contextProvider);
  }

  public static DataStore<Preferences> providePreferencesDataStore(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePreferencesDataStore(context));
  }
}
