package com.aladinjunior.news.domain.usecase

import com.aladinjunior.news.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend fun invoke() : Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}