package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //Disables the bar at the top of the app.
        setContentView(R.layout.activity_main)

        val intent=getIntent()
        val name=intent.getStringExtra("Name")
        viewtext.text="Hi! "+name

        findGarage.setOnClickListener(){
            val intent= Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}