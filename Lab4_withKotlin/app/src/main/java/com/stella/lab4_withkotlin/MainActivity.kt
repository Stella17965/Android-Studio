package com.stella.lab4_withkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var tv_meal: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_meal = findViewById(R.id.tv_meal)
        btn = findViewById(R.id.btn_choice)
        btn.setOnClickListener(View.OnClickListener {
            startActivityForResult(
                Intent(
                    this@MainActivity,
                    MainActivity2::class.java
                ), 1
            )
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data == null) return
        if (requestCode == 1) {
            if (resultCode == 101) {
                val b = data.extras
                val str1 = b!!.getString("drink")
                val str2 = b.getString("sugar")
                val str3 = b.getString("ice")
                tv_meal!!.text = String.format("飲料：%s\n\n甜度：%s\n\n冰塊：%s", str1, str2, str3)
            }
        }
    }
}