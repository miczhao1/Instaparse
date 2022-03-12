package com.example.businesscardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView


class MainActivity : AppCompatActivity() {
//    val linkedIn = findViewById<TextView>(R.id.LinkedIn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        linkedIn.setMovementMethod(LinkMovementMethod.getInstance());
    }
}