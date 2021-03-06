package com.example.hitshub.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hitshub.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        create_account_button.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }

        have_account_button.setOnClickListener {
        }
    }
}
