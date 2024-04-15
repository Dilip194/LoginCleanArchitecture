package com.example.logincleanarchitecture.di

import com.example.logincleanarchitecture.data.repository.LoginRepositoryImpl
import com.example.logincleanarchitecture.data.repository.network.LoginAPIService
import com.example.logincleanarchitecture.domain.repository.LoginRepository
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DataModule {

   /* fun provideRetrofit() : Retrofit{

    }
    fun provideApiService() : LoginAPIService{
        return
    }
    fun provideLoginRepo() : LoginRepository{
        return LoginRepositoryImpl()
    }*/
}