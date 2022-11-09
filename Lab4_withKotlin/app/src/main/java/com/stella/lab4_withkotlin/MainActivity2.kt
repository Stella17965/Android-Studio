package com.stella.lab4_withkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    lateinit var send_btn: Button
    lateinit var set_drink: EditText
    lateinit var rg1: RadioGroup
    lateinit var rg2: RadioGroup

    private var sugar = "無糖"
    private var ice_opt = "去冰"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        rg1 = findViewById(R.id.radioGroup)
        rg1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, i ->
            when (i) {
                R.id.radioButton5 -> sugar = "無糖"
                R.id.radioButton6 -> sugar = "少糖"
                R.id.radioButton7 -> sugar = "半糖"
                R.id.radioButton8 -> sugar = "全糖"
            }
        })
        rg2 = findViewById<RadioGroup>(R.id.radioGroup2)
        rg2.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, i ->
            when (i) {
                R.id.radioButton9 -> ice_opt = "去冰"
                R.id.radioButton10 -> ice_opt = "微冰"
                R.id.radioButton11 -> ice_opt = "少冰"
                R.id.radioButton12 -> ice_opt = "正常冰"
            }
        })
        send_btn = findViewById(R.id.btn_send)
        send_btn.setOnClickListener(View.OnClickListener {
            set_drink = findViewById(R.id.ed_drink)
            val drink = set_drink.getText().toString()
            val i = Intent()
            val b = Bundle()
            b.putString("sugar", sugar)
            b.putString("drink", drink)
            b.putString("ice", ice_opt)
            i.putExtras(b)
            setResult(101, i)
            finish()
        })
    }
}