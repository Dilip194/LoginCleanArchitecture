package com.example.logincleanarchitecture.domain.usecases

import com.example.logincleanarchitecture.domain.repository.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(val repository: LoginRepository) {

     operator fun invoke(name : String,pass : String) = repository.login(name,pass)
}