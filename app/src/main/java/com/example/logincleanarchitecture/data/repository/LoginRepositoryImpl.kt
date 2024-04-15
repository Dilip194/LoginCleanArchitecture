package com.example.logincleanarchitecture.data.repository

import com.example.logincleanarchitecture.data.repository.network.LoginAPIService
import com.example.logincleanarchitecture.domain.model.LoginModel
import com.example.logincleanarchitecture.domain.repository.LoginRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(loginAPIService: LoginAPIService) : LoginRepository {

    override fun login(username: String, password: String): Flow<LoginModel> = flow {

    }
}