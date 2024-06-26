package com.example.base.di

import com.example.base.repository.ProductRepository
import com.example.base.repository.ProductRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindProductRepository(
        productRepositoryImpl: ProductRepositoryImpl
    ): ProductRepository

}