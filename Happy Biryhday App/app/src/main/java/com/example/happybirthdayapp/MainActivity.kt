package com.example.happybirthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {

        val editText=findViewById<EditText>(R.id.name_input)
        val text=editText.text.toString()
        /*Toast.makeText(this,"name is $text", Toast.LENGTH_LONG).show()*/
        val intent=Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,text)
        startActivity(intent)

    }

}