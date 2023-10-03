package com.example.mad_practical_9_21012021012

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var alarmanimation: AnimationDrawable


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alarm: ImageView =findViewById(R.id.imagealarm)
        alarm.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation=alarm.background as AnimationDrawable


    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if(hasFocus){
            alarmanimation.start()
        }
        else{
            alarmanimatin.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}