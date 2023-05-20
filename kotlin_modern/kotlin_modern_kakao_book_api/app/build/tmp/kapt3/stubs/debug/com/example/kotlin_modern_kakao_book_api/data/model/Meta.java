package com.example.kotlin_modern_kakao_book_api.data.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/kotlin_modern_kakao_book_api/data/model/Meta;", "", "isEnd", "", "pageableCount", "", "totalCount", "(ZII)V", "()Z", "getPageableCount", "()I", "getTotalCount", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Meta {
    @com.squareup.moshi.Json(name = "is_end")
    private final boolean isEnd = false;
    @com.squareup.moshi.Json(name = "pageable_count")
    private final int pageableCount = 0;
    @com.squareup.moshi.Json(name = "total_count")
    private final int totalCount = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlin_modern_kakao_book_api.data.model.Meta copy(boolean isEnd, int pageableCount, int totalCount) {
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
    
    public Meta(boolean isEnd, int pageableCount, int totalCount) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isEnd() {
        return false;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPageableCount() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTotalCount() {
        return 0;
    }
}