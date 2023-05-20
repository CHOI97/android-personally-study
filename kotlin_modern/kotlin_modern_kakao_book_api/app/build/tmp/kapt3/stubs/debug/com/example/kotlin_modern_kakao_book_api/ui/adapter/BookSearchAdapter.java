package com.example.kotlin_modern_kakao_book_api.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;
import com.example.kotlin_modern_kakao_book_api.databinding.ItemBookPreviewBinding;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/adapter/BookSearchAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "Lcom/example/kotlin_modern_kakao_book_api/ui/adapter/BookSearchViewHolder;", "()V", "onItemClickListener", "Lkotlin/Function1;", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "Companion", "app_debug"})
public final class BookSearchAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.kotlin_modern_kakao_book_api.data.model.Book, com.example.kotlin_modern_kakao_book_api.ui.adapter.BookSearchViewHolder> {
    private kotlin.jvm.functions.Function1<? super com.example.kotlin_modern_kakao_book_api.data.model.Book, kotlin.Unit> onItemClickListener;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kotlin_modern_kakao_book_api.ui.adapter.BookSearchAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.kotlin_modern_kakao_book_api.data.model.Book> BookDiffCallback = null;
    
    public BookSearchAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kotlin_modern_kakao_book_api.ui.adapter.BookSearchViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kotlin_modern_kakao_book_api.ui.adapter.BookSearchViewHolder holder, int position) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.kotlin_modern_kakao_book_api.data.model.Book, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/ui/adapter/BookSearchAdapter$Companion;", "", "()V", "BookDiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}