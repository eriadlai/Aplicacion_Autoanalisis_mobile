package com.example.proy_hackaton_kotlin.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EstresViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Cuestionario para medir el nivel de estrés"
    }
    val text: LiveData<String> = _text
}