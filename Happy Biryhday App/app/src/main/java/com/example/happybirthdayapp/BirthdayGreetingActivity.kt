package com.example.happybirthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object
    {
        const val NAME_EXTRA="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name=intent.getStringExtra(NAME_EXTRA)

        val textView = findViewById(R.id.birthday_greetings) as TextView
        textView.text="Happy birthday\n$name!"



    }
}