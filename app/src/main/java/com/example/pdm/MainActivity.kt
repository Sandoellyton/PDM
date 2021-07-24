package com.example.pdm

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textViewMensagem: TextView
    private lateinit var textViewResposta: TextView
    private lateinit var btNova: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.textViewMensagem = findViewById(R.id.text1)
        this.textViewResposta = findViewById(R.id.text2)
        this.textViewMensagem.text = Build.BRAND.toString()

        this.btNova = findViewById(R.id.button)
        this.btNova.setOnClickListener {
            this.textViewResposta.text = "Marca do dispositivo"
        }
    }
}