package com.example.prueba

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
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
        // definicion de los objetos
        var  btnIngresar: Button
        var txtNombres:TextView

        btnIngresar=findViewById(R.id.btnIngresar)
        txtNombres=findViewById(R.id.txtNombres)

        //configurar la accion al presionar el boton de ingresar

        btnIngresar.setOnClickListener{
            var nombre= txtNombres.text

            //se utiliza el mensaje toast para mostrar el saludo

            Toast.makeText(applicationContext,
                "Hola mi querido cliente${nombre}",

                Toast.LENGTH_SHORT// duracion del mensaje

            ).show()
        }
    }

}