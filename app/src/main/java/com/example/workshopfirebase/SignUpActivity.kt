package com.example.workshopfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        //init FirebaseAuth variable

        signup_button.setOnClickListener {
            if (checkValues(email_editText.text.toString(), password_editText.text.toString(), confirm_editText.text.toString()))
                createUserAccount(email_editText.text.toString(), password_editText.text.toString())
        }
    }

    private fun checkValues(email: String, password: String, confirmation: String): Boolean {
        if (email.isEmpty() || password.isEmpty() || confirmation.isEmpty()) {
            Toast.makeText(applicationContext, "A field is empty", Toast.LENGTH_LONG).show()
            return false
        }
        if (password != confirmation) {
            Toast.makeText(applicationContext, "Passwords don't match", Toast.LENGTH_LONG).show()
            return false
        }
        return true
    }

    private fun createUserAccount(email: String, password: String) {
        //implement sign up code
    }
}
