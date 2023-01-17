package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //Disables the bar at the top of the app.
        setContentView(R.layout.activity_login)
    }
    fun savebutton(view: View){
        val name=editText.text.toString()

        val intent = Intent(this@Login, MainActivity::class.java)
        intent.putExtra("Name", name)
        startActivity(intent)
    }
}