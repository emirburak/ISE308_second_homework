package com.example.tripcal

import android.util.Log


abstract class Airplane(val vType : String, val isFlying: Boolean, val avgSpeed: Double) //this is the the parent class which is inherited by child classes
{
    val TAG = "Airplane"

    init {
        Log.i(TAG, "Travelling by $vType at an average speed of $avgSpeed km/h.")
    }

    abstract fun getFuel() //this is the first abstract function definiton to use polymorphism in child classes
    abstract fun info()  //this is the second abstract function definiton to use polymorphism in child classes
}