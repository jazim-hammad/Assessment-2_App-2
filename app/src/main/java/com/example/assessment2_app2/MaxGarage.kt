package com.example.assessment2_app2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_big_city_garage.*

class MaxGarage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //Disables the bar at the top of the app.
        setContentView(R.layout.activity_max_garage)
        button_link.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/6P3Lva1ScmVCxQDb8"))
            startActivity(i)
        }
    }
}