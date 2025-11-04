package com.example.meuprojeto

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcularImc(view : View){
        val textResultado = findViewById<TextView>(R.id.textResultado)
        val editPeso = findViewById<EditText>(R.id.editPeso)
        val editAltura = findViewById<EditText>(R.id.editAltura)
        val peso = editPeso.getText().toString()
        val altura = editAltura.getText().toString()
        val pesoConvertido : Double = peso.toDouble()
        val alturaConvertida : Double = altura.toDouble()
        val resultadoImc = pesoConvertido / (alturaConvertida * alturaConvertida)
        textResultado.setText("Seu IMC é: %.2f".format(resultadoImc))


    }




}