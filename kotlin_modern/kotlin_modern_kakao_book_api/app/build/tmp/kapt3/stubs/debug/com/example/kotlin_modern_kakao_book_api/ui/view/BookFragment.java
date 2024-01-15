package com.example.kotlin_modern_kakao_book_api.ui.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.example.kotlin_modern_kakao_book_api.databinding.FragmentBookBinding;
import com.example.kotlin_modern_kakao_book_api.ui.viewmodel.BookViewModel;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/view/BookFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/kotlin_modern_kakao_book_api/databinding/FragmentBookBinding;", "args", "Lcom/example/kotlin_modern_kakao_book_api/ui/view/BookFragmentArgs;", "getArgs", "()Lcom/example/kotlin_modern_kakao_book_api/ui/view/BookFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/example/kotlin_modern_kakao_book_api/databinding/FragmentBookBinding;", "bookViewModel", "Lcom/example/kotlin_modern_kakao_book_api/ui/viewmodel/BookViewModel;", "getBookViewModel", "()Lcom/example/kotlin_modern_kakao_book_api/ui/viewmodel/BookViewModel;", "bookViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onPause", "onResume", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class BookFragment extends androidx.fragment.app.Fragment {
    private com.example.kotlin_modern_kakao_book_api.databinding.FragmentBookBinding _binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy bookViewModel$delegate = null;
    
    public BookFragment() {
        super();
    }
    
    private final com.example.kotlin_modern_kakao_book_api.databinding.FragmentBookBinding getBinding() {
        return null;
    }
    
    private final com.example.kotlin_modern_kakao_book_api.ui.view.BookFragmentArgs getArgs() {
        return null;
    }
    
    private final com.example.kotlin_modern_kakao_book_api.ui.viewmodel.BookViewModel getBookViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
}