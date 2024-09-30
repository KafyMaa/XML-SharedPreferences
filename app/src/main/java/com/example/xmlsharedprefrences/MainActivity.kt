package com.example.xmlsharedprefrences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etFirstName = findViewById<EditText>(R.id.fName)
        val etLastName = findViewById<EditText>(R.id.lName)
        val number = findViewById<EditText>(R.id.number)



        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener{

            Preferences.setStringValue(FIRST_NAME,etFirstName.text.toString())
            Preferences.setStringValue(LAST_NAME,etLastName.text.toString())
            Preferences.setStringValue(NUMBER,number.text.toString())
            val intent = Intent(this, GetterText::class.java)
            startActivity(intent)

        }



    }
}