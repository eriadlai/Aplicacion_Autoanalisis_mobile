package com.example.proy_hackaton_kotlin.ui.slideshow

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
import com.example.proy_hackaton_kotlin.databinding.FragmentSlideshowBinding
import com.example.proy_hackaton_kotlin.ui.gallery.AnsiedadQuizView

class DepresionFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val depresionViewModel =
                ViewModelProvider(this).get(DepresionViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.oTVTituloQuizDepresion
        depresionViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        val btn: Button = root.findViewById(R.id.oBtnStartDepresion)

        btn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(view:View?){
                val intent = Intent(this@DepresionFragment.requireContext(), DepresionQuizView::class.java)
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