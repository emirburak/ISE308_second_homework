package com.example.tripcal

import android.util.Log

class JetPlane (vType: String, isFlying : Boolean, avgSpeed: Double): Airplane(vType , isFlying , avgSpeed ) //this is the child class inherited from abstract class Airplane
{
    override fun info()
    {
        Log.i(TAG, "Be careful about what you fly $vType is a serious stuff :/")
    }

    override fun getFuel() //this is a sample utilization of polymorphism by overriding abstract function getFuel
    {
        Log.i(TAG, "getFuel: Land to the nearast airbase ")
    }

    companion object
    {
        const val TAG = "JetPlane"
    }
}