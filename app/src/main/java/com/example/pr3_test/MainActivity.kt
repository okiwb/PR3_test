package com.example.pr3_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toGenerate: Button= findViewById(R.id.button)
        toGenerate.setOnClickListener {
            val generatePass: TextView = findViewById(R.id.textView2)
            //generatePass.text = "IT WORKS"
            val randomPassword = StringBuilder()
            for (i in 0 until 10){
                if (i % 2 == 0) {
                    val dig = Random().nextInt(10)
                    randomPassword.append(dig)
                } else {
                    val letter = (97 + Random().nextInt(26)).toChar()
                    randomPassword.append(letter)
                }



            }
            generatePass.text = randomPassword
        }


    }

}
