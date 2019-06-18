package com.example.workshopfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_forgot_pass.*

class ForgotPassActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)

        //Init FirebaseAuth

        send_email_button.setOnClickListener {
            if (email_editText.text.toString().isNotEmpty())
                sendPassword(email_editText.text.toString())
        }
    }

    private fun sendPassword(emailAddress: String) {
        //implement forgot password code
    }
}
