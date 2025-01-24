package com.app.ecostep.data.repository
import com.app.ecostep.data.api.user.IUserService
import com.app.ecostep.domain.model.User
import com.app.ecostep.domain.repository.IUserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val apiService: IUserService
) : IUserRepository {
    override suspend fun createUser(token: String, user: User): Result<Unit> {
        return try {
            val response = apiService.createUser(token, user)
            if (response.isSuccessful) {
                Result.success(Unit)
            } else {
                Result.failure(Exception("Error: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}