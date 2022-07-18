package com.example.proy_hackaton_kotlin.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnsiedadViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Cuestionario para medir el nivel de ansiedad"
    }
    val text: LiveData<String> = _text
}