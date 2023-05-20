package com.example.kotlin_modern_kakao_book_api.ui.view;

import android.view.View;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.filters.SmallTest;
import com.example.kotlin_modern_kakao_book_api.R;
import com.example.kotlin_modern_kakao_book_api.ui.adapter.BookSearchViewHolder;
import dagger.hilt.android.testing.HiltAndroidRule;
import dagger.hilt.android.testing.HiltAndroidTest;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u000b8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/view/MainActivityTest;", "", "()V", "activityScenarioRule", "Landroidx/test/ext/junit/rules/ActivityScenarioRule;", "Lcom/example/kotlin_modern_kakao_book_api/ui/view/MainActivity;", "getActivityScenarioRule", "()Landroidx/test/ext/junit/rules/ActivityScenarioRule;", "setActivityScenarioRule", "(Landroidx/test/ext/junit/rules/ActivityScenarioRule;)V", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "from_SearchFragment_to_FavoriteFragment_Ui_Operation", "", "test_activity_state", "waitFor", "Landroidx/test/espresso/ViewAction;", "delay", "", "app_debug"})
@dagger.hilt.android.testing.HiltAndroidTest()
public final class MainActivityTest {
    @org.jetbrains.annotations.NotNull()
    private androidx.test.ext.junit.rules.ActivityScenarioRule<com.example.kotlin_modern_kakao_book_api.ui.view.MainActivity> activityScenarioRule;
    @org.jetbrains.annotations.NotNull()
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    
    public MainActivityTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final androidx.test.ext.junit.rules.ActivityScenarioRule<com.example.kotlin_modern_kakao_book_api.ui.view.MainActivity> getActivityScenarioRule() {
        return null;
    }
    
    public final void setActivityScenarioRule(@org.jetbrains.annotations.NotNull()
    androidx.test.ext.junit.rules.ActivityScenarioRule<com.example.kotlin_modern_kakao_book_api.ui.view.MainActivity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final dagger.hilt.android.testing.HiltAndroidRule getHiltRule() {
        return null;
    }
    
    public final void setHiltRule(@org.jetbrains.annotations.NotNull()
    dagger.hilt.android.testing.HiltAndroidRule p0) {
    }
    
    @androidx.test.filters.SmallTest()
    @org.junit.Test()
    public final void test_activity_state() {
    }
    
    @androidx.test.filters.LargeTest()
    @org.junit.Test()
    public final void from_SearchFragment_to_FavoriteFragment_Ui_Operation() {
    }
    
    private final androidx.test.espresso.ViewAction waitFor(long delay) {
        return null;
    }
}