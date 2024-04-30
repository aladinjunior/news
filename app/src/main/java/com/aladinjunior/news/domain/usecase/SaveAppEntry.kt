package com.aladinjunior.news.domain.usecase

import com.aladinjunior.news.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {

    suspend fun invoke() {
        localUserManager.saveAppEntry()
    }
}