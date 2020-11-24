package com.emirburak.object_orientation_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tripcal.JetPlane
import com.example.tripcal.Glider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bingoCaller() //calling function
    }

    private fun bingoCaller() //function definition
    {
        val gliderPlane = Glider("Glider", true, 200.0)
        gliderPlane.getFuel()
        gliderPlane.info()

        val jetFighter = JetPlane("Fighter Jet ",  true , 800.0)
        jetFighter.getFuel()
        jetFighter.info()
    }
}