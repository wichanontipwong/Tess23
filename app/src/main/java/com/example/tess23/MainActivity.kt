package com.example.tess23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            var num1 = n1.text.toString()
            var num2 = n2.text.toString()
            if(num1.isEmpty() || num2.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            s1.text = "+"
            s2.text = (num1.toDouble() + num2.toDouble()).toString()
        }
        b2.setOnClickListener {
            var num1 = n1.text.toString()
            var num2 = n2.text.toString()
            if(num1.isEmpty() || num2.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            s1.text = "-"
            s2.text = (num1.toDouble() - num2.toDouble()).toString()
        }
        b3.setOnClickListener {
            var num1 = n1.text.toString()
            var num2 = n2.text.toString()
            if(num1.isEmpty() || num2.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            s1.text = "*"
            s2.text = (num1.toDouble() * num2.toDouble()).toString()
        }
        b4.setOnClickListener {
            var num1 = n1.text.toString()
            var num2 = n2.text.toString()
            if(num1.isEmpty() || num2.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            s1.text = "/"
            s2.text = (num1.toDouble() / num2.toDouble()).toString()
        }
        b5.setOnClickListener {
            var num1 = n1.text.toString()
            var num2 = n2.text.toString()
            if(num1.isEmpty() || num2.isEmpty() )
                return@setOnClickListener Toast.makeText(this@MainActivity,"Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            s1.text = "%"
            s2.text = (num1.toDouble() % num2.toDouble()).toString()
        }
        b6.setOnClickListener {
            n1.text.clear()
            n2.text.clear()
            s1.text = " "
            s2.text = " "
        }
    }
}