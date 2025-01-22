package com.app.ecostep.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.ecostep.domain.model.User
import com.app.ecostep.domain.usecase.CreateUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val createUserUseCase: CreateUserUseCase
) : ViewModel() {

    fun createUser(token: String, user: User) {
        viewModelScope.launch {
            try {
                createUserUseCase(token, user)
            } catch (e: Exception) {
                // Manejar el error
            }
        }
    }
}
