package com.example.proy_hackaton_kotlin.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DepresionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Cuestionario para medir el nivel de depresion"
    }
    val text: LiveData<String> = _text
}