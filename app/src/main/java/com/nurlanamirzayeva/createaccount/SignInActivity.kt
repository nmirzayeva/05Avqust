package com.nurlanamirzayeva.createaccount

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.nurlanamirzayeva.createaccount.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()

    }

    private fun setupUI() {
        binding.signOutButton.setOnClickListener {
            signOut()
        }
    }

    private fun signOut() {
        startActivity(SignUpActivity.getLaunchIntent(this))
        FirebaseAuth.getInstance().signOut()
    }

    companion object {
        fun getLaunchIntent(from: Context) = Intent(from, SignUpActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

}