package com.medanis.fneclis

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            val intent = Intent(this, License::class.java)
// To pass any data to another activity
            intent.putExtra("targetURL", "www.firstlink.com")
// start your SecondActivity
            startActivity(intent)

        }
        button2.setOnClickListener{
            val intent = Intent(this, License::class.java)
// To pass any data to another activity
            intent.putExtra("targetURL", "www.secondlink.com")
// start your SecondActivity
            startActivity(intent)

        }
        button3.setOnClickListener{
            val intent = Intent(this, License::class.java)
// To pass any data to another activity
            intent.putExtra("targetURL", "www.thirdlink.com")
// start your SecondActivity
            startActivity(intent)

        }
    }
}
