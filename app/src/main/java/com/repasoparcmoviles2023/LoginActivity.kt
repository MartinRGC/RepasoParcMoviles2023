package com.repasoparcmoviles2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var edtemail : EditText
    lateinit var edtpassword : EditText
    lateinit var btnIngresar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtemail = findViewById(R.id.edtemail)
        edtpassword = findViewById(R.id.edtpassword)
        btnIngresar = findViewById(R.id.btnIngresar)

        btnIngresar.setOnClickListener {


            var log = Intent(this, LoginActivity::class.java)
            val email = edtemail.text.toString()
            val password = edtpassword.text.toString()
            val intent = Intent(this, MainActivity::class.java)
           fun validate(email: String,password: String) {

                if (email == "admin@smartapp.com" && password == "admin123"){

                    startActivity(intent)

            }else{
                    startActivity(log)

               }
            }
          validate(email,password)
        }

    }
}