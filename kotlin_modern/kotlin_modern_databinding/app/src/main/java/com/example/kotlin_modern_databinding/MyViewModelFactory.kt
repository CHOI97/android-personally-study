package com.example.kotlin_modern_databinding


import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner

@Suppress("", "UNCHECKED_CAST")
class MyViewModelFactory(
    private val counter: Int,
    owner: SavedStateRegistryOwner,
    defaultArgs : Bundle? = null,
): AbstractSavedStateViewModelFactory(owner, defaultArgs){
    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        if(modelClass.isAssignableFrom(MyViewModel::class.java)){
            return MyViewModel(counter,handle) as T
        }
        throw IllegalArgumentException("ViewModel class not found")
    }

}
