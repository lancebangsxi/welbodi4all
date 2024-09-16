package com.example.welbodi4all

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private var skip: TextView? = null
private var logn: Button? = null
private var signup: Button? = null

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        skip = findViewById(R.id.skip)

        logn = findViewById(R.id.login_btn)
        signup = findViewById(R.id.signup_btn)

        skip!!.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }

        logn!!.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            //finish()
        }

        signup!!.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            //finish()
        }
    }
}