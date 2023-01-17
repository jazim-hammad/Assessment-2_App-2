package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //Disables the bar at the top of the app.
        setContentView(R.layout.activity_main2)

        card1.setOnClickListener(){
            val intent= Intent(this, Card1::class.java)
            startActivity(intent)
        }
        card2.setOnClickListener(){
            val intent= Intent(this, Card2::class.java)
            startActivity(intent)
        }
        card3.setOnClickListener(){
            val intent= Intent(this, Card3::class.java)
            startActivity(intent)
        }
    }
}