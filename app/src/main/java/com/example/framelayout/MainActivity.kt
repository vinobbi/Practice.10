package com.example.framelayout

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.tablelayout)
        setTitle("TableLayout")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.table_main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    fun giveOrientationAndGravity(view: View) {
        val tvOrient: TextView = findViewById(R.id.textView2)
        val tvGravity: TextView = findViewById(R.id.textView4)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val btn5: Button = findViewById(R.id.button5)
        val btn6: Button = findViewById(R.id.button6)

        when (view.id) {
            R.id.button1 -> {
                tvOrient.text = "Вертикальная"
            }

            R.id.button2 -> {
                tvGravity.text = "по левой границе"
            }

            R.id.button3 -> {
                tvOrient.text = "Горизонтальная"
            }

            R.id.button4 -> {
                tvGravity.text = "по центру"
            }

            R.id.button5 -> {
                tvOrient.text = "Вертикальная"
            }

            R.id.button6 -> {
                tvGravity.text = "по правой границе"
            }
        }
    }
        fun onButtonClick(view: View) {
            val btn2: Button = findViewById(R.id.button2)
            val btn1: Button = findViewById(R.id.button1)

            when (view.id) {
                R.id.button1 -> {
                    btn1.visibility = View.GONE
                    btn2.visibility = View.VISIBLE
                }

                R.id.button2 -> {
                    btn1.visibility = View.VISIBLE
                    btn2.visibility = View.GONE
                }
            }
        }


}