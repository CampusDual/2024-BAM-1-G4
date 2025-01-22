package com.app.ecostep.data.repository
import com.app.ecostep.data.api.UserService
import com.app.ecostep.domain.model.User
import com.app.ecostep.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val apiService: UserService
) : UserRepository {
    override suspend fun createUser(token: String, user: User) {
        apiService.createUser(token, user)
    }
}