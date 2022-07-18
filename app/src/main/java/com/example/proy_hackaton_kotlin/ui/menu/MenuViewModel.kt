package com.example.proy_hackaton_kotlin.ui.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Menu Principal"
    }
    val text: LiveData<String> = _text
}