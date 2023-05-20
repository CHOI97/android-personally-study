package com.example.kotlin_modern_kakao_book_api.ui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.kotlin_modern_kakao_book_api.databinding.FragmentFavoriteBinding;
import com.example.kotlin_modern_kakao_book_api.ui.adapter.BookSearchPagingAdapter;
import com.example.kotlin_modern_kakao_book_api.ui.viewmodel.FavoriteViewModel;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/view/FavoriteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/kotlin_modern_kakao_book_api/databinding/FragmentFavoriteBinding;", "binding", "getBinding", "()Lcom/example/kotlin_modern_kakao_book_api/databinding/FragmentFavoriteBinding;", "bookSearchAdapter", "Lcom/example/kotlin_modern_kakao_book_api/ui/adapter/BookSearchPagingAdapter;", "favoriteViewModel", "Lcom/example/kotlin_modern_kakao_book_api/ui/viewmodel/FavoriteViewModel;", "getFavoriteViewModel", "()Lcom/example/kotlin_modern_kakao_book_api/ui/viewmodel/FavoriteViewModel;", "favoriteViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "setupRecyclerView", "setupTouchHelper", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FavoriteFragment extends androidx.fragment.app.Fragment {
    private com.example.kotlin_modern_kakao_book_api.databinding.FragmentFavoriteBinding _binding;
    private final kotlin.Lazy favoriteViewModel$delegate = null;
    private com.example.kotlin_modern_kakao_book_api.ui.adapter.BookSearchPagingAdapter bookSearchAdapter;
    
    public FavoriteFragment() {
        super();
    }
    
    private final com.example.kotlin_modern_kakao_book_api.databinding.FragmentFavoriteBinding getBinding() {
        return null;
    }
    
    private final com.example.kotlin_modern_kakao_book_api.ui.viewmodel.FavoriteViewModel getFavoriteViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupTouchHelper(android.view.View view) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}