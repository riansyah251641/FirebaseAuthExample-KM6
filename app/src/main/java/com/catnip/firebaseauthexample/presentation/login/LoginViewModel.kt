package com.catnip.firebaseauthexample.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.catnip.firebaseauthexample.data.repository.UserRepository
import kotlinx.coroutines.Dispatchers

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class LoginViewModel(private val repository: UserRepository) : ViewModel() {
    fun doLogin(email: String, password: String)=
        repository.
        doLogin(email, password).
        asLiveData(Dispatchers.IO)
}