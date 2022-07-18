package com.example.proy_hackaton_kotlin.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.proy_hackaton_kotlin.R
import com.example.proy_hackaton_kotlin.databinding.FragmentGalleryBinding

class AnsiedadFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val ansiedadViewModel =
                ViewModelProvider(this).get(AnsiedadViewModel::class.java)


        _binding = FragmentGalleryBinding.inflate(inflater, container, false)

        val root: View = binding.root

        val textView: TextView = binding.oTVTituloQuiz
        ansiedadViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        val btn: Button = root.findViewById(R.id.oBtnStartAnsiedad)

      btn.setOnClickListener(object: View.OnClickListener{
          override fun onClick(view:View?){
              val intent = Intent(this@AnsiedadFragment.requireContext(),AnsiedadQuizView::class.java)
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