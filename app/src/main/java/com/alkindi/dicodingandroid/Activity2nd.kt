package com.alkindi.dicodingandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet

//TODO: LOGIC BWT ACTIVITY KE 2
class Activity2nd:AppCompatActivity(){
    private lateinit var lebar2nd:EditText;
    private lateinit var tinggi2nd:EditText;
    private lateinit var panjang2nd:EditText;
    private lateinit var buttonhitung2nd:Button
    private lateinit var hasil2nd:TextView
    private lateinit var kembali2nd: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lebar2nd = findViewById(R.id.lebar2nd)
        tinggi2nd = findViewById(R.id.tinggi2nd)
        panjang2nd =findViewById(R.id.panjang2nd)
        buttonhitung2nd = findViewById(R.id.hitung2nd)
        hasil2nd =findViewById(R.id.hasil2nd)
        kembali2nd=findViewById(R.id.kembali2nd)

        buttonhitung2nd.setOnClickListener {
            val panjang = panjang2nd.text.toString()
            val lebar =lebar2nd.text.toString()
            val tinggi = tinggi2nd.text.toString()
            val hasil =panjang.toInt()*lebar.toInt()*tinggi.toInt()
            hasil2nd.text = hasil.toString()

        }
        kembali2nd.setOnClickListener {
            finishActivity(R.layout.activity_2nd)
            setContentView(R.layout.activity_main)
        }
    }
}