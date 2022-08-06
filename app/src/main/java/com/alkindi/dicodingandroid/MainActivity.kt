package com.alkindi.dicodingandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: FIX LOGIC BWT ACTIVITY 2
//        //Activity 2nd Logic
//        edtWidth =findViewById(R.id.lebar2nd)
//        edtLength=findViewById(R.id.panjang2nd)
//        edtHeight=findViewById(R.id.Tinggi2nd)
//        buttonCalculate =findViewById(R.id.btnAct2_htng)
//        tvresult =findViewById(R.id.result2nd)
//        buttonCalculate.setOnClickListener(){
//            val inputLength = edtLength.text.toString().trim()
//            val inputWidth =edtWidth.text.toString().trim()
//            val inputHeight =edtHeight.text.toString().trim()
//
//            var isEmpty=false
//
//            if (inputLength.isEmpty()){
//                isEmpty=true
//                edtLength.error="Bagian ini tidak boleh kosong!"
//            }
//            if (inputWidth.isEmpty()){
//                isEmpty=true
//                edtWidth.error="Bagian ini tidak boleh kosong"
//            }
//            if (inputHeight.isEmpty()){
//                isEmpty=true
//                edtHeight.error="Bagian ini tidak boleh kosong"
//            }
//
//            if (!isEmpty){
//                val vol =inputLength.toDouble()*inputWidth.toDouble()*inputHeight.toDouble()
//                tvresult.text =vol.toString()
//            }
//        }


        //Activity main only
        var btn_pindah =findViewById<Button>(R.id.pndh)
        var panjang =findViewById<EditText>(R.id.panjang)
        var lebar =findViewById<EditText>(R.id.lebar)
        var tinggi = findViewById<EditText>(R.id.tinggi)
        var  btn =findViewById<Button>(R.id.btn_hitung)
        var hasill =findViewById<TextView>(R.id.hasil)
        btn.setOnClickListener(){
            val pnjng =panjang.text.toString()
            val lbr =lebar.text.toString()
            val tggi = tinggi.text.toString()
            val hasil = pnjng.toInt()*lbr.toInt()*tggi.toInt()
            hasill.text=hasil.toString()
        }
        btn_pindah.setOnClickListener {
            finishActivity(R.layout.activity_main)

            setContentView(R.layout.activity_2nd)
        }


    }

//    override fun onClick(v: View?) {
//
//        if (v?.id ==R.id.btnAct2_htng){
//
//
//        }
//    }


}