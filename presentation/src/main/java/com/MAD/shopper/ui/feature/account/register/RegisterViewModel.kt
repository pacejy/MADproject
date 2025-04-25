package com.MAD.shopper.ui.feature.account.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.MAD.domain.network.ResultWrapper
import com.MAD.domain.usecase.LoginUseCase
import com.MAD.domain.usecase.RegisterUseCase
import com.MAD.shopper.ShopperSession
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class RegisterViewModel(
    private val registerUseCase: RegisterUseCase,
    private val shopperSession: ShopperSession
) : ViewModel() {
    private val _registerState = MutableStateFlow<RegisterState>(RegisterState.Idle)
    val registerState = _registerState

    fun register(email: String, password: String, name: String) {
        _registerState.value = RegisterState.Loading
        viewModelScope.launch {
            when (val response = registerUseCase.execute(email, password, name)) {
                is ResultWrapper.Success -> {
                    shopperSession.storeUser(response.value)
                    _registerState.value = RegisterState.Success()
                }

                is ResultWrapper.Failure -> {
                    _registerState.value = RegisterState.Error(
                        response.exception.message
                            ?: "Something went wrong!"
                    )
                }
            }
        }
    }
}

sealed class RegisterState {
    object Idle : RegisterState()
    object Loading : RegisterState()
    class Success : RegisterState()
    data class Error(val message: String) : RegisterState()
}