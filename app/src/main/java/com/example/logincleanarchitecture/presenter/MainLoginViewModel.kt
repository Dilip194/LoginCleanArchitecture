package com.example.logincleanarchitecture.presenter

import androidx.lifecycle.ViewModel
import com.example.logincleanarchitecture.domain.usecases.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainLoginViewModel @Inject constructor(val useCase: LoginUseCase) : ViewModel() {


    fun login(name: String, password : String){
        useCase.invoke(name,password)
    }
}