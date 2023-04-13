package com.example.kotlin_modern_kakao_book_api.di

import android.content.Context
import androidx.room.Room
import com.example.kotlin_modern_kakao_book_api.data.db.BookSearchDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {

    @Provides
    @Named("test_db")
    fun provideInMemoryDb(@ApplicationContext context: Context): BookSearchDatabase =
        Room.inMemoryDatabaseBuilder(context, BookSearchDatabase::class.java)
            .allowMainThreadQueries()
            .build()
}