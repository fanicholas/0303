package com.example.a0303

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    lateinit var Margherita: CheckBox
    lateinit var Peperoni: CheckBox
    lateinit var Burger: CheckBox
    lateinit var Capriciosa: CheckBox
    lateinit var Kasa: CheckBox
    lateinit var Chicken: CheckBox
    lateinit var ZAKONCZ: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        Margherita = findViewById(R.id.checkBox1)
        Peperoni = findViewById(R.id.checkBox2)
        Burger = findViewById(R.id.checkBox3)
        Capriciosa = findViewById(R.id.checkBox4)
        Kasa = findViewById(R.id.checkBox5)
        Chicken = findViewById(R.id.checkBox6)
        ZAKONCZ = findViewById(R.id.button)
        ZAKONCZ.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Selected Items")
            if (Margherita.isChecked) {
                result.append("\nMargherita")
                totalAmount += 18
            }
            if (Peperoni.isChecked) {
                result.append("\nPeperoni")
                totalAmount += 21
            }
            if (Burger.isChecked) {
            result.append("\nBurger")
            totalAmount += 20
        }
            if (Capriciosa.isChecked) {
                result.append("\nCapriciosa")
                totalAmount += 23
            }
            if (Kasa.isChecked) {
                result.append("\nKasa")
                totalAmount += 19
            }
            if (Chicken.isChecked) {
                result.append("\nChicken")
                totalAmount += 25
            }
            result.append("\nTotal: " + totalAmount + " zł")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}

