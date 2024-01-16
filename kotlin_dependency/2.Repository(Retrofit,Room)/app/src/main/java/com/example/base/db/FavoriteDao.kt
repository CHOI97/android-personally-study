package com.example.base.db

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.base.model.Product
import com.example.base.util.Constants.FAVORITE_PRODUCT_TABLE_NAME
import kotlinx.coroutines.flow.Flow

interface FavoriteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(favorite: Favorite)

    @Query("SELECT * FROM $FAVORITE_PRODUCT_TABLE_NAME")
    suspend fun getFavoriteList(): List<Favorite>

    @Delete
    suspend fun deleteFavorite(favorite: Favorite)



}