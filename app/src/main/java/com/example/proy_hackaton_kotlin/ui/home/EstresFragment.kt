package com.example.proy_hackaton_kotlin.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.proy_hackaton_kotlin.R
import com.example.proy_hackaton_kotlin.databinding.FragmentHomeBinding
import com.example.proy_hackaton_kotlin.ui.gallery.AnsiedadQuizView

class EstresFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val estresViewModel =
                ViewModelProvider(this).get(EstresViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.oTVTituloQuizEstres
        estresViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        val btn: Button = root.findViewById(R.id.oBtnStartEstres)

        btn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(view:View?){
                val intent = Intent(this@EstresFragment.requireContext(), EstresQuizView::class.java)
                startActivity(intent);
                onDestroyView();
            }
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}