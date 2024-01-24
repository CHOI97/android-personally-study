package com.example.data.repository.db

import com.example.data.db.Favorite

interface FavoriteRepository {
    suspend fun insertFavorite(favorite: Favorite)
    suspend fun getFavoriteList(): List<Favorite>
    suspend fun deleteFavorite(favorite: Favorite)
}