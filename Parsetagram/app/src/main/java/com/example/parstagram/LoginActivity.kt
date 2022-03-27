package com.example.parstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.parsetagram.R
import com.parse.ParseUser


class LoginActivity : AppCompatActivity() { // In AndroidManifest, we set it so the activity always starts at LoginActivity when the app is run
    // Check to see if a user is logged in already
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 1st step: create EditText field for username and password
        // 2nd step: create a login button
                    // button --> make an OnClickListener
                    // switch between two activities --> Intent
        findViewById<Button>(R.id.login_button).setOnClickListener {
            val username = findViewById<EditText>(R.id.et_username).text.toString()
            val password = findViewById<EditText>(R.id.et_password).text.toString()
            loginUser(username, password)   // make a new function called loginUser
        }
    }

    // Integrate Parse SDK
    private fun loginUser(username: String, password: String) {
        // code referenced from User Session Login website


        // Making a network call
        ParseUser.logInInBackground(username, password, ({ user, e ->
            if (user != null) {
                // Signup succeeded
                Log.i(TAG, "Successfully logged in user!")
//                goToMainActivity() // After logging in, let's take them to go to a new page
            } else {
                // Signup failed.  Look at the ParseException to see what happened.
                e.printStackTrace()
                Toast.makeText(this, "Error logging in", Toast.LENGTH_SHORT).show()
            }})
        )
    }

//    private fun goToMainActivity() {
//        val intent = Intent(this@LoginActivity, MainActivity::class.java)
//        startActivity(intent)
//        //finish() // Makes it so that when pressing the back button on Android, it won't return to this Activity. We don't want to log in again!
//    }

    companion object {
        const val TAG = "LoginActivity"
    }
}