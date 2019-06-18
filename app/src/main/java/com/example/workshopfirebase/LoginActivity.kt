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
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    //Add FirebaseAuth variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signup_button.setOnClickListener{ startActivity(Intent(this, SignUpActivity::class.java)) }
        forgotpass_text.setOnClickListener{ startActivity(Intent(this, ForgotPassActivity::class.java)) }

    }


}
