package com.android.my2bmi_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heihtEditText = findViewById<EditText>(R.id.et_height)
        val weihtEditText = findViewById<EditText>(R.id.et_weight)
        val submitButton = findViewById<Button>(R.id.btn_check)

        submitButton.setOnClickListener {

            if (heihtEditText.text.isEmpty()) {
                Toast.makeText(this,"신장을 입력해주세요.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (weihtEditText.text.isEmpty()) {
                Toast.makeText(this,"체중을 입력해주세요.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val height : Int = heihtEditText.text.toString().toInt()
            val weight : Int = weihtEditText.text.toString().toInt()

            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("height",height)
            intent.putExtra("weight",weight)
            startActivity((intent))



        }


    }
}