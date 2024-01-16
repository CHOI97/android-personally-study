package com.example.base.di

import android.content.Context
import androidx.room.Room
import com.example.base.db.FavoriteDatabase
import com.example.base.network.Api
import com.example.base.util.Constants
import com.example.base.util.Constants.BASE_URL
import com.example.base.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MyModule {

    @Provides
    fun provideBaseUrl() = BASE_URL

    // OkHttp3
    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient{
        val  httpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }
    // Retrofit
    @Singleton
    @Provides
     fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit{
        return Retrofit.Builder().client(okHttpClient)
            .baseUrl(provideBaseUrl())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    // API Service
    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): Api{
        return retrofit.create(Api::class.java)
    }
    // Room
    @Singleton
    @Provides
    fun provideBookSearchDatabase(@ApplicationContext context: Context): FavoriteDatabase =
        Room.databaseBuilder(
            context.applicationContext,
            FavoriteDatabase::class.java,
            "$DATABASE_NAME"
        ).build()
}