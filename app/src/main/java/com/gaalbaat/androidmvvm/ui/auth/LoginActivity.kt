package com.gaalbaat.androidmvvm.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.gaalbaat.androidmvvm.R
import com.gaalbaat.androidmvvm.databinding.ActivityLoginBinding
import com.gaalbaat.androidmvvm.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this ,R.layout.activity_login)

        val viewModel = ViewModelProviders.
            of(this).
            get(AuthViewModel::class.java)

        // Add viewUiModel from Login Activity
        binding.viewUiModel = viewModel
        // set listener to Current Activity
        viewModel.authListener = this

    }

    override fun onStarted() {
        toast("Login Started...")
    }

    override fun onSuccess() {
        toast("Login Success...")
    }

    override fun onFailure(message: String) {
        toast(message)
    }

}
