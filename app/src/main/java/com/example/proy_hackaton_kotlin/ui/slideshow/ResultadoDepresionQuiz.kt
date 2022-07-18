package com.example.proy_hackaton_kotlin.ui.slideshow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.proy_hackaton_kotlin.MainActivity
import com.example.proy_hackaton_kotlin.R

class ResultadoDepresionQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_depresion_quiz)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val oTV_Anuncio = findViewById<TextView>(R.id.oTV_AnuncioDepresion)
        val oTV_Explicacion = findViewById<TextView>(R.id.oTV_ExplicacionDepresion)
        val oBtn = findViewById<Button>(R.id.oBtnFinalizarDepresion)
        val oResultado = intent.getIntExtra("oResultadoDepresion",0)

        if ((oResultado >= 5) && (oResultado <= 9)){
            oTV_Anuncio.text="Tu nivel de depresión es: NORMAL";
            oTV_Explicacion.text="En este nivel de depresión se recomienda que tengas actividades recreativas y sociales como practicar algún deporte, aprender un instrumento musical, salir con amistades, toda actividad que te genere distraerte.";
        }else if((oResultado>=10)&&(oResultado<=18)){
            oTV_Anuncio.text="Tu nivel de depresión  es: LEVE A MODERADA"
            oTV_Explicacion.text="En este nivel de depresión se recomienda que tengas actividades recreativas y sociales como practicar algún deporte, aprender un instrumento musical, salir con amistades, toda actividad que te genere distraerte. Como también es importante acudir algunos cursos o terapias psicológicas y de superación personal.";
        }else if((oResultado>=19)&&(oResultado<=29)){
            oTV_Anuncio.text="Tu nivel de depresión  es: MODERADA A SEVERA";
            oTV_Explicacion.text="En este nivel de depresión se recomienda buscar apoyo profesional, acudir a un proceso de terapia psicológica.";
        }else if((oResultado>=30)&&(oResultado<=39)){
            oTV_Anuncio.text="Tu nivel de depresión  es: SEVERA";
            oTV_Explicacion.text="En este nivel de depresión se recomienda buscar apoyo profesional, acudir a un proceso de terapia psicológica y Psiquiátrica.";
        }else if(oResultado<=4){
            oTV_Anuncio.text="Tu nivel de depresión  es: UNA POSIBLE NEGACION DE LA DEPRESION";
            oTV_Explicacion.text="Se recomienda revisar con su psicoterapeuta los criterios de sus síntomas.";
        }else if(oResultado>=40){
            oTV_Anuncio.text="Tu nivel de depresión  es: UNA POSIBLE EXAGERACION DE LA DEPRESION";
            oTV_Explicacion.text="Se recomienda revisar con su psicoterapeuta los criterios de sus síntomas.";
        }
        oBtn.setOnClickListener{
            startActivity(Intent(this@ResultadoDepresionQuiz, MainActivity::class.java))
            finish()
        }
    }
}