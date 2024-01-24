package com.example.data.repository.db

import com.example.data.db.Favorite
import com.example.data.db.FavoriteDatabase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FavoriteRepositoryImpl @Inject constructor(
    private val db: FavoriteDatabase
) : FavoriteRepository {
    override suspend fun insertFavorite(favorite: Favorite) {
        db.favoriteDao().insertFavorite(favorite)
    }

    override suspend fun getFavoriteList(): List<Favorite> {
        return db.favoriteDao().getFavoriteList()
    }

    override suspend fun deleteFavorite(favorite: Favorite) {
        db.favoriteDao().deleteFavorite(favorite)
    }
}