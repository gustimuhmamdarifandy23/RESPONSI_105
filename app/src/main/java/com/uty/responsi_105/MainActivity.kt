package com.uty.responsi_105

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.Ga2)
        val password = findViewById<EditText>(R.id.Ga3)

        Ga4.setOnClickListener(){
            if (username.text.toString()=="Gusti"&& password.text.toString()=="12345"){
                intent= Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "username & password anda salah boss !!!", Toast.LENGTH_LONG).show()
            }

        }

        Ga5.setOnClickListener(){
            intent= Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}
