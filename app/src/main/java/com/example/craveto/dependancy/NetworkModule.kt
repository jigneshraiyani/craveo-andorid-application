package com.example.craveto.dependancy

import com.example.craveto.api.UserAPI
import com.example.craveto.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(dagger.hilt.components.SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun provideUserAPI(retrofit: Retrofit): UserAPI {
        return  retrofit.create(UserAPI::class.java)
    }
}