package com.example.xmlsharedprefrences

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GetterText: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_getter_text)
        val firstNameField = findViewById<TextView>(R.id.fName)
        val lastNameField = findViewById<TextView>(R.id.lName)
        val numberField = findViewById<TextView>(R.id.number)

        firstNameField.setText(Preferences.getStringValue(FIRST_NAME) ?: "")
        lastNameField.setText(Preferences.getStringValue(LAST_NAME) ?: "")
        numberField.setText(Preferences.getStringValue(NUMBER) ?: "")
    }
}