package com.example.czynniki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Oblicz).setOnClickListener{
            var x = findViewById<EditText>(R.id.Liczba).text.toString().toInt()
            var czyn=""
            var a = 2
            while (x>1){
                while (x%a==0){
                    czyn = czyn + a + " "
                    x/=a
                }//while2
                ++a
            }//while1
            findViewById<TextView>(R.id.Wynik).text = czyn
        }//button
    }
}