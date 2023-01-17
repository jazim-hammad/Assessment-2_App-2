package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_card1.*

class Card2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //Disables the bar at the top of the app.
        setContentView(R.layout.activity_card2)
        location_button.setOnClickListener {
            val intent = Intent(this, MaxGarage::class.java)
            startActivity(intent)
        }
    }
}