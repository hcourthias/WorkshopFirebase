package com.example.workshopfirebase

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.view.ViewTreeObserver
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Init FirebaseAuth variable

        signup_button.setOnClickListener{ startActivity(Intent(this, SignUpActivity::class.java)) }
        forgotpass_text.setOnClickListener{ startActivity(Intent(this, ForgotPassActivity::class.java)) }
        login_button.setOnClickListener {
            if (checkValues(email_editText.text.toString(), password_editText.text.toString()))
                userLogin(email_editText.text.toString(), password_editText.text.toString())
        }

    }

    private fun checkValues(email: String, password: String): Boolean {
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(applicationContext, "A field is empty", Toast.LENGTH_LONG).show()
            return false
        }
        return true
    }

    private fun userLogin(email: String, password: String) {
        //implement login code
    }



}
