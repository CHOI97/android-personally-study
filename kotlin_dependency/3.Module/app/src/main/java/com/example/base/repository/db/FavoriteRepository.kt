package com.example.base.repository.db

import com.example.base.db.Favorite

interface FavoriteRepository {
    suspend fun insertFavorite(favorite: Favorite)
    suspend fun getFavoriteList(): List<Favorite>
    suspend fun deleteFavorite(favorite: Favorite)
}