package com.emirhan.multipurposecalculator.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.emirhan.multipurposecalculator.R
import com.emirhan.multipurposecalculator.databinding.FragmentClasicCalculatorBinding
import com.emirhan.multipurposecalculator.databinding.FragmentMenuBinding


class clasicCalculator : Fragment() {
    private var _binding: FragmentClasicCalculatorBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentClasicCalculatorBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding=FragmentClasicCalculatorBinding.bind(view)

        try {
            binding.toplaBtn.setOnClickListener {
                val sayi1=binding.sayi1.text.toString().toDoubleOrNull()
                val sayi2=binding.sayi2.text.toString().toDoubleOrNull()
                if (sayi1==null||sayi2==null){

                    Toast.makeText(requireContext(),"Lütfen sayıları girin",Toast.LENGTH_LONG).show()
                    binding.sonuc.text="Lütfen boş bırakmayın."
                }else{
                    val sonuc=sayi1+sayi2
                    binding.sonuc.text=sonuc.toString()

                }
            }
            binding.cKarBtn.setOnClickListener {
                val sayi1=binding.sayi1.text.toString().toDoubleOrNull()
                val sayi2=binding.sayi2.text.toString().toDoubleOrNull()
                if (sayi1==null||sayi2==null){
                    Toast.makeText(requireContext(),"Lütfen sayıları girin",Toast.LENGTH_LONG).show()
                    binding.sonuc.text="Lütfen boş bırakmayın."
                }else{
                    val sonuc=sayi1-sayi2
                    binding.sonuc.text=sonuc.toString()
                }
            }
            binding.carpBtn.setOnClickListener {
                val sayi1=binding.sayi1.text.toString().toDoubleOrNull()
                val sayi2=binding.sayi2.text.toString().toDoubleOrNull()
                if (sayi1==null||sayi2==null){
                    Toast.makeText(requireContext(),"Lütfen sayıları girin",Toast.LENGTH_LONG).show()
                    binding.sonuc.text="Lütfen boş bırakmayın."
                }else{
                    val sonuc=sayi1*sayi2
                    binding.sonuc.text=sonuc.toString()
                }
            }
            binding.bolBtn.setOnClickListener {
                val sayi1=binding.sayi1.text.toString().toDoubleOrNull()
                val sayi2=binding.sayi2.text.toString().toDoubleOrNull()
                if (sayi1==null||sayi2==null){
                    Toast.makeText(requireContext(),"Lütfen sayıları girin",Toast.LENGTH_LONG).show()
                    binding.sonuc.text="Lütfen boş bırakmayın."
                }else{
                    val sonuc=sayi1/sayi2
                    binding.sonuc.text=sonuc.toString()
                }
            }

        }catch (e:Exception){
            println(e.localizedMessage)
        }



    }


}