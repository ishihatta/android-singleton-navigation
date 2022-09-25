package com.ishihata_tech.navigationwithsingleton

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class InputDataModule {
    @Singleton
    @Binds
    abstract fun bindInputData(
        inputDataImpl: InputDataImpl
    ): InputData
}