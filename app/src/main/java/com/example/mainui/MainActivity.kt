package com.example.mainui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var my_btn : ImageButton = findViewById<ImageButton>(R.id.map_btn)

        my_btn.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)

        }




    }



}