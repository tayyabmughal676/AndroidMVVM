package com.gaalbaat.androidmvvm.ui.auth

interface AuthListener {

    fun onStarted()
    fun onSuccess()
    fun onFailure(message : String )


}