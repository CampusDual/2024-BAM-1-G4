package com.app.ecostep.domain.repository

import com.app.ecostep.domain.model.User

interface IUserRepository {
    suspend fun createUser(token: String, user: User): Result<Unit>
}