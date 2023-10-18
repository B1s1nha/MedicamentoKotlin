package com.example.medicamentoapp.ui.metas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.medicamentoapp.databinding.FragmentMetasBinding

class MetasFragment : Fragment() {

    private var _binding: FragmentMetasBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val metasViewModel =
                ViewModelProvider(this).get(MetasViewModel::class.java)

        _binding = FragmentMetasBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMetas
        metasViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}