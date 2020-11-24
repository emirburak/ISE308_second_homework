package com.example.tripcal

import android.util.Log

class Glider (vType : String, isFlying: Boolean, avgSpeed: Double): Airplane(vType , isFlying , avgSpeed) //this is the child class inherited from abstract class Airplane
{
    override fun info()
    {
        Log.i(TAG, "Chill dude you fly with a $vType which is a training plane :)")
    }

    override fun getFuel() // this is a sample utilization of polymorphism by overriding abstract function getFuel
    {
        Log.i(TAG, "getFuel: Soar down to the nearest landing place")
    }

    companion object
    {
        const val TAG = "Glider"
    }
}