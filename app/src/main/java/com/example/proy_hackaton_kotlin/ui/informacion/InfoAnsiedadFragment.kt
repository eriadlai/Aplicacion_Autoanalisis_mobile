package com.example.proy_hackaton_kotlin.ui.informacion

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proy_hackaton_kotlin.R
import com.example.proy_hackaton_kotlin.databinding.FragmentInfoAnsiedadBinding
import com.example.proy_hackaton_kotlin.databinding.FragmentMenuBinding
import com.example.proy_hackaton_kotlin.ui.menu.MenuViewModel

class InfoAnsiedadFragment : Fragment() {

    private var _binding: FragmentInfoAnsiedadBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: InfoAnsiedadViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val InfoAnsiedadViewModel =
            ViewModelProvider(this).get(InfoAnsiedadViewModel::class.java)


        _binding = FragmentInfoAnsiedadBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}