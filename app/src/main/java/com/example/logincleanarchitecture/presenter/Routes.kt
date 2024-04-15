package com.example.logincleanarchitecture.presenter

sealed class Routes(val route: String) {
    object Login : Routes("Login")
}