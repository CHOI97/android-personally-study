package com.example.kotlin_modern_kakao_book_api.data.model;

import com.squareup.moshi.JsonClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/model/SearchResponse;", "", "documents", "", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Book;", "meta", "Lcom/example/kotlin_modern_kakao_book_api/data/model/Meta;", "(Ljava/util/List;Lcom/example/kotlin_modern_kakao_book_api/data/model/Meta;)V", "getDocuments", "()Ljava/util/List;", "getMeta", "()Lcom/example/kotlin_modern_kakao_book_api/data/model/Meta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class SearchResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.kotlin_modern_kakao_book_api.data.model.Book> documents = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.kotlin_modern_kakao_book_api.data.model.Meta meta = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlin_modern_kakao_book_api.data.model.SearchResponse copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kotlin_modern_kakao_book_api.data.model.Book> documents, @org.jetbrains.annotations.NotNull()
    com.example.kotlin_modern_kakao_book_api.data.model.Meta meta) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SearchResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kotlin_modern_kakao_book_api.data.model.Book> documents, @org.jetbrains.annotations.NotNull()
    com.example.kotlin_modern_kakao_book_api.data.model.Meta meta) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kotlin_modern_kakao_book_api.data.model.Book> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kotlin_modern_kakao_book_api.data.model.Book> getDocuments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlin_modern_kakao_book_api.data.model.Meta component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlin_modern_kakao_book_api.data.model.Meta getMeta() {
        return null;
    }
}