package com.cookandroid.kotlin_study_sharedpreference

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    fun insert(user: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM User")
    fun selectAll(): List<User>

    @Query("SELECT * FROM User WHERE userId= :userId")
    fun selectByUserId(userId: Int): User

    @Query("SELECT * FROM User WHERE name= :name")
    fun selectByName(name: String): List<User>

    @Query("UPDATE User SET name = :name WHERE userId= :userId")
    fun updateNameByUserId(userId: Int, name: String)
}