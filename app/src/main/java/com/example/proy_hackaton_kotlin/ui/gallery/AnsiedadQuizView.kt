package com.example.proy_hackaton_kotlin.ui.gallery

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.proy_hackaton_kotlin.R
import com.example.proy_hackaton_kotlin.backend.Preguntas
import com.example.proy_hackaton_kotlin.backend.Quiz

class AnsiedadQuizView : AppCompatActivity(), View.OnClickListener {
    private var oPosicionActual:Int=1;
    private var oLista: ArrayList<Quiz>?=null;
    private var oSelectedOpc:Int=0;
    private var oResultado:Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ansiedad_quiz_view)
         val oProgressBar = findViewById<ProgressBar>(R.id.oProgressBar);
         val oTVProgress = findViewById<TextView>(R.id.oTVProgress);
         val oTVPregunta = findViewById<TextView>(R.id.oTV_Pregunta);
         val oOpc1 = findViewById<TextView>(R.id.oTVOpc1);
         val oOpc2 = findViewById<TextView>(R.id.oTVOpc2);
         val oOpc3 = findViewById<TextView>(R.id.oTVOpc3);
         val oOpc4 = findViewById<TextView>(R.id.oTVOpc4);
        val oBtn = findViewById<Button>(R.id.oBtnSubmit);

        oLista = Preguntas.oGetPreguntasAnsiedad();
        setPreguntas(oOpc1,oOpc2,oOpc3,oOpc4,oProgressBar,oTVProgress,oTVPregunta);
        oOpc1.setOnClickListener(this);
        oOpc2.setOnClickListener(this);
        oOpc3.setOnClickListener(this);
        oOpc4.setOnClickListener(this);
        oBtn.setOnClickListener(this);
    }
    private fun setPreguntas(oOpc1:TextView,oOpc2:TextView,oOpc3:TextView,oOpc4:TextView,oProgressBar:ProgressBar,oTVProgress:TextView,oTVPregunta:TextView){
        val oPregunta = oLista!![oPosicionActual-1];
        defaultOptions();
        oProgressBar.progress = oPosicionActual;
        oTVProgress.text="$oPosicionActual" + "/"+oProgressBar.max;
        oTVPregunta.text=oPregunta!!.pregunta;
        oOpc1.text=""+oPregunta.valor0;
        oOpc2.text=""+oPregunta.valor1;
        oOpc3.text=""+oPregunta.valor2;
        oOpc4.text=""+oPregunta.valor3;


    }
    private fun defaultOptions(){
        val oOpc1 = findViewById<TextView>(R.id.oTVOpc1);
        val oOpc2 = findViewById<TextView>(R.id.oTVOpc2);
        val oOpc3 = findViewById<TextView>(R.id.oTVOpc3);
        val oOpc4 = findViewById<TextView>(R.id.oTVOpc4);
        val oOpciones = ArrayList<TextView>()
        oOpciones.add(0,oOpc1)
        oOpciones.add(1,oOpc2)
        oOpciones.add(2,oOpc3)
        oOpciones.add(3,oOpc4)

        for (opc in oOpciones){
            opc.setTextColor(Color.parseColor("#7A8089"));
            opc.typeface = Typeface.DEFAULT
            opc.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?,) {
        val oProgressBar = findViewById<ProgressBar>(R.id.oProgressBar);
        val oTVProgress = findViewById<TextView>(R.id.oTVProgress);
        val oTVPregunta = findViewById<TextView>(R.id.oTV_Pregunta);
        val oOpc1 = findViewById<TextView>(R.id.oTVOpc1);
        val oOpc2 = findViewById<TextView>(R.id.oTVOpc2);
        val oOpc3 = findViewById<TextView>(R.id.oTVOpc3);
        val oOpc4 = findViewById<TextView>(R.id.oTVOpc4);
        val oBtn = findViewById<Button>(R.id.oBtnSubmit);

        when(v?.id){
            R.id.oTVOpc1 ->{
                selectedOption(oOpc1,1)
            }
            R.id.oTVOpc2 ->{
                selectedOption(oOpc2,2)
            }
            R.id.oTVOpc3 ->{
                selectedOption(oOpc3,3)
            }
            R.id.oTVOpc4 ->{
                selectedOption(oOpc4,4)
            }
            R.id.oBtnSubmit ->{
                if(oSelectedOpc == 0){
                    Toast.makeText(this,"Favor de seleccionar alguna de las opciones disponibles.",Toast.LENGTH_SHORT).show()


                }else {
                    oPosicionActual++
                    oResultado += (oSelectedOpc - 1);
                    if(oPosicionActual == oLista!!.size){
                        oBtn.text="Finalizar";
                    }


                        when{
                            oPosicionActual <= oLista!!.size -> {
                                setPreguntas(oOpc1,oOpc2,oOpc3,oOpc4,oProgressBar,oTVProgress,oTVPregunta);
                            }else ->{
                           val intent = Intent(this@AnsiedadQuizView,ResultadoAnsiedadQuiz::class.java)
                            intent.putExtra("oResultado",oResultado)
                            startActivity(intent)
                            finish()
                        }
                    }
                    oSelectedOpc=0;
                }
            }
        }
    }
    private fun selectedOption(tv:TextView,opcSelected: Int){
        defaultOptions()
        oSelectedOpc = opcSelected;
        tv.setTextColor(Color.parseColor("#7A8089"));
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }
}