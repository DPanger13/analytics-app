package com.dpanger.recipes.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal class DataModule {
    @Provides
    fun provideRecipeRepository() = recipeRepository()
}