package com.example.logincleanarchitecture.domain.repository

import com.example.logincleanarchitecture.domain.model.LoginModel
import kotlinx.coroutines.flow.Flow

interface LoginRepository {
    fun login(username : String,password : String) : Flow<LoginModel>
}