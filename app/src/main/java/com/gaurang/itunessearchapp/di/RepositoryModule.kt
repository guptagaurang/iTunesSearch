package com.gaurang.itunessearchapp.di

import android.content.Context
import com.gaurang.itunessearchapp.data.mapper.ContentMapper
import com.gaurang.itunessearchapp.data.network.ApiServiceRetrofit
import com.gaurang.itunessearchapp.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@InstallIn(ApplicationComponent::class)
@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(
        @ApplicationContext appContext: Context,
        retrofit: ApiServiceRetrofit,
        contentEntityMapper: ContentMapper
    ): MainRepository {
        return MainRepository(
            appContext,
            retrofit,
            contentEntityMapper
        )
    }
}
