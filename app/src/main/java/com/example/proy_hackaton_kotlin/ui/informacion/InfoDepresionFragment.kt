package com.example.proy_hackaton_kotlin.ui.informacion

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proy_hackaton_kotlin.R
import com.example.proy_hackaton_kotlin.databinding.FragmentInfoAnsiedadBinding
import com.example.proy_hackaton_kotlin.databinding.FragmentInfoDepresionBinding

class InfoDepresionFragment : Fragment() {

    private var _binding: FragmentInfoDepresionBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: InfoDepresionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val InfoDepresionViewModel =
            ViewModelProvider(this).get(InfoDepresionViewModel::class.java)


        _binding = FragmentInfoDepresionBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}