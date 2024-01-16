package com.example.base.di

import com.example.base.network.Api
import com.example.base.util.Constants
import com.example.base.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
/*
* @InstallIn
* 해당 어노테이션은 Hilt의 표준 컴포넌트들 중 어떤 컴포넌트에 모듈을 설치할지를 결정
* 콤마(,)를 통해 여러 컴포넌트에 install 가능
*/
@Module
@InstallIn(SingletonComponent::class)
object MyModule {

    @Provides
    fun provideBaseUrl() = BASE_URL

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient{
        val  httpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Singleton
    @Provides
     fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit{
        return Retrofit.Builder().client(okHttpClient)
            .baseUrl(provideBaseUrl())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): Api{
        return retrofit.create(Api::class.java)
    }
}