package com.example.kotlin_modern_kakao_book_api.data.db;

import androidx.test.core.app.ApplicationProvider;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.testing.TestComponentData;
import dagger.hilt.android.internal.testing.TestComponentDataSupplier;
import dagger.hilt.android.internal.testing.root.DaggerDefault_HiltComponents_SingletonC;
import dagger.hilt.internal.GeneratedComponentManager;
import java.lang.SuppressWarnings;
import java.util.Collections;
import javax.annotation.processing.Generated;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class BookSearchDaoTest_TestComponentDataSupplier extends TestComponentDataSupplier {
  protected TestComponentData get() {
    return new TestComponentData(false, testInstance -> injectInternal((BookSearchDaoTest) testInstance), Collections.emptySet(), Collections.emptySet(), (modules, testInstance, autoAddModuleEnabled) -> DaggerDefault_HiltComponents_SingletonC.builder()
        .applicationContextModule(
            new ApplicationContextModule(Contexts.getApplication(ApplicationProvider.getApplicationContext())))
        .build());
  }

  @SuppressWarnings("unchecked")
  private static void injectInternal(BookSearchDaoTest testInstance) {
    ((BookSearchDaoTest_GeneratedInjector) ((GeneratedComponentManager) Contexts.getApplication(ApplicationProvider.getApplicationContext())).generatedComponent()).injectTest(testInstance);
  }
}
