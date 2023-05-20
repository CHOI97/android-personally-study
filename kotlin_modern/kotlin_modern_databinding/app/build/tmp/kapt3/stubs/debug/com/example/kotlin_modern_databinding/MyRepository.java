package com.example.kotlin_modern_databinding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/kotlin_modern_databinding/MyRepository;", "", "getCounter", "Landroidx/lifecycle/LiveData;", "", "increaseCounter", "", "app_debug"})
public abstract interface MyRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getCounter();
    
    public abstract void increaseCounter();
}