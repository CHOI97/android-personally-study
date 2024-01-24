package com.example.presentation.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.db.Favorite
import com.example.base.repository.db.FavoriteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteListViewModel @Inject constructor(
    private val favoriteRepository: FavoriteRepository
) : ViewModel() {

    private val _favoriteList =  MutableLiveData<List<Favorite>>()
    val favoriteList: LiveData<List<Favorite>> get() = _favoriteList

    fun getFavoriteList() = viewModelScope.launch(Dispatchers.IO) {
        _favoriteList.postValue(favoriteRepository.getFavoriteList())
    }

    fun deleteFavorite(favorite: Favorite) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepository.deleteFavorite(favorite)
        val updatedList = favoriteRepository.getFavoriteList()
        _favoriteList.postValue(updatedList)
    }

}