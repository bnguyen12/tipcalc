package edu.washington.bennyn.tipcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var amount: EditText
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.tipBtn)
        btn.isEnabled = false

        amount = findViewById(R.id.inputAmount)
    }
}