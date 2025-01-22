package com.app.ecostep.domain.repository

import com.app.ecostep.domain.model.User

interface UserRepository {
    suspend fun createUser(token: String, user: User): Result<Unit>
}