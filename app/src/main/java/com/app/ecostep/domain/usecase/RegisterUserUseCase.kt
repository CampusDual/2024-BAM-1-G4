package com.app.ecostep.domain.usecase

import com.app.ecostep.domain.model.User
import com.app.ecostep.domain.repository.UserRepository
import javax.inject.Inject

class CreateUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(token: String, user: User) {
        userRepository.createUser(token, user)
    }
}