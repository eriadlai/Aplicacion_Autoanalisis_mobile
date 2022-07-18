package com.example.proy_hackaton_kotlin.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.proy_hackaton_kotlin.MainActivity
import com.example.proy_hackaton_kotlin.R

class ResultadoEstresQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_estres_quiz)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val oTV_Anuncio = findViewById<TextView>(R.id.oTV_AnuncioEstres)
        val oTV_Explicacion = findViewById<TextView>(R.id.oTV_ExplicacionEstres)
        val oBtn = findViewById<Button>(R.id.oBtnFinalizarEstres)
        val oResultado = intent.getIntExtra("oResultadoEstres",0)

        if ((oResultado == 1) || (oResultado == 8)||(oResultado == 15)||(oResultado == 22)||(oResultado == 29)||(oResultado == 36)){
            oTV_Anuncio.text="Tu nivel de estrés es: Focalizado en la solución del problema (FSP). ";
            oTV_Explicacion.text="La meta de la focalización es alcanzar a estimular el proceso exploratorio y hacer " +
                    "que los problemas se resuelvan más fácilmente. Las funciones de la focalización: " +
                    "Expresar de una manera más profunda una determinada emoción.";
        }else if((oResultado == 2) || (oResultado == 9)||(oResultado == 16)||(oResultado == 23)||(oResultado == 30)||(oResultado == 37)){
            oTV_Anuncio.text="Tu nivel de estrés es: Autofocalización negativa (AFN) ";
            oTV_Explicacion.text="Caracterizada por indefensión, culpa, sentimientos de incapacidad para afrontar la " +
                    "situación y creencia de que las cosas suelen salir mal, este estilo de afrontamiento " +
                    "afecta de manera considerable varias dimensiones de la calidad de vida percibida.";
        }else if((oResultado == 3) || (oResultado == 10)||(oResultado == 17)||(oResultado == 24)||(oResultado == 31)||(oResultado == 38)){
            oTV_Anuncio.text="Reevaluación positiva (REP) ";
            oTV_Explicacion.text="La reevaluación positiva consiste en ver el lado positivo ante la adversidad, " +
                    "relativizar el problema, pensar que podría haber sido peor, asumir que es posible " +
                    "sacar algo bueno de todo eso y que hay cosas más importantes que el problema";
        }else if((oResultado == 4) || (oResultado == 11)||(oResultado == 18)||(oResultado == 25)||(oResultado == 32)||(oResultado == 39)){
            oTV_Anuncio.text="Tu nivel de estrés es: Expresión emocional abierta (EEA)  ";
            oTV_Explicacion.text="Describe la tendencia a expresar las dificultades para afrontar las emociones " +
                    "generadas por la situación, expresar las emociones y resolver el problema.";
        }else if((oResultado == 5) || (oResultado == 12)||(oResultado == 19)||(oResultado == 26)||(oResultado == 33)||(oResultado == 40)){
            oTV_Anuncio.text="Tu nivel de aestrés es: Evitación (EVT)";
            oTV_Explicacion.text="Propone que distraigamos nuestros pensamientos estresantes para evitar que nos " +
                    "genere consecuencias negativas en nuestra vida, el distraer el pensamiento y las " +
                    "emociones estresantes evitamos que nos afecte de manera negativa el estrés.";
        }else if((oResultado == 6) || (oResultado == 13)||(oResultado == 20)||(oResultado == 27)||(oResultado == 34)||(oResultado == 41)){
            oTV_Anuncio.text="Tu nivel de estrés es: Búsqueda de apoyo social (BAS)";
            oTV_Explicacion.text="Se describe como \"un proceso de interacción entre personas o grupos de personas, " +
                    "que a través del contacto sistemático establecen vínculos de amistad y de " +
                    "información, recibiendo apoyo material, emocional y afectivo en la solución de " +
                    "situaciones cotidianas en momentos de crisis”";
        }else if((oResultado == 7) || (oResultado == 14)||(oResultado == 21)||(oResultado == 28)||(oResultado == 35)||(oResultado == 42)){
            oTV_Anuncio.text="Tu nivel de estrés es: Religión (RLG)";
            oTV_Explicacion.text="Su objetivo es fortalecer la “fe” ante una creencia espiritual, religiosa que generara " +
                    "una estabilidad emocional y psicologica y asi bajar la intencidad del estrés.";
        }else{
            oTV_Anuncio.text="Tu nivel de estrés es: CONFUSO";
            oTV_Explicacion.text="Es recomendable que visites a un especialista para verificar tu caso.";
        }
        oBtn.setOnClickListener{
            startActivity(Intent(this@ResultadoEstresQuiz, MainActivity::class.java))
            finish()
        }
    }
}