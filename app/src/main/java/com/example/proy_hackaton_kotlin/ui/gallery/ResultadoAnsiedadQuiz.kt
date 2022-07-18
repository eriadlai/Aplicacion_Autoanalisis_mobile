package com.example.proy_hackaton_kotlin.ui.gallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.proy_hackaton_kotlin.MainActivity
import com.example.proy_hackaton_kotlin.R

class ResultadoAnsiedadQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ansiedad_quiz)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val oTV_Anuncio = findViewById<TextView>(R.id.oTV_Anuncio)
        val oTV_Explicacion = findViewById<TextView>(R.id.oTV_Explicacion)
        val oBtn = findViewById<Button>(R.id.oBtnFinalizarAnsiedad)
        val oResultado = intent.getIntExtra("oResultado",0)

        if ((oResultado >= 0) && (oResultado <= 21)){
            oTV_Anuncio.text="Tu nivel de ansiedad es: MUY BAJA";
            oTV_Explicacion.text="En este nivel de ansiedad se recomienda que tengas actividades recreativas y sociales como practicar algún deporte, " +
                    "aprender un instrumento musical, salir con amistades, toda actividad que te genere distraerte. Tambien se recomienda acudir a terapias de relajación como el" +
                    " yoga, pilates, entre otras terapias alternativas.";
        }else if((oResultado>=22)&&(oResultado<=35)){
            oTV_Anuncio.text="Tu nivel de ansiedad es: MODERADA";
            oTV_Explicacion.text="En este nivel de Ansiedad se recomienda buscar apoyo profesional, acudir a un proceso de terapia psicológica.";
        }else if(oResultado>36){
            oTV_Anuncio.text="Tu nivel de ansiedad es: SEVERA";
            oTV_Explicacion.text="En este nivel de Ansiedad se recomienda buscar apoyo profesional, acudir a un proceso de terapia psicológica y Psiquiátrica";
        }
        oBtn.setOnClickListener{
            startActivity(Intent(this@ResultadoAnsiedadQuiz,MainActivity::class.java))
            finish()
        }
    }
}