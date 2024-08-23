package com.emirhan.multipurposecalculator.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.emirhan.multipurposecalculator.R
import com.emirhan.multipurposecalculator.databinding.FragmentAreaCalculationBinding
import com.emirhan.multipurposecalculator.databinding.FragmentMenuBinding


class areaCalculation : Fragment() {
    private var _binding: FragmentAreaCalculationBinding? = null
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
        _binding = FragmentAreaCalculationBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding=FragmentAreaCalculationBinding.bind(view)
        try {
            binding.krBtnSnc.setOnClickListener {
                val taban=binding.tabanKare.text.toString().toIntOrNull()
                val yukseklik=binding.yuseklikKare.text.toString().toIntOrNull()
                if (taban==null||yukseklik==null){
                    Toast.makeText(requireContext(),"Lütfen alanları eksiksiz doldurun",Toast.LENGTH_SHORT).show()
                    binding.krSnc.text="Lütfen alanları boş bırakmayınız!"
                }else{
                    Toast.makeText(requireContext(),"Başarılı",Toast.LENGTH_SHORT).show()
                    val sonuc=taban*yukseklik
                    binding.krSnc.text=sonuc.toString()
                }
            }
            binding.ucgenBtn.setOnClickListener {
                val UcgenTaban=binding.ucgenTbn.text.toString().toIntOrNull()
                val UcgenYukseklik=binding.yukselikUcgen.text.toString().toIntOrNull()
                if (UcgenTaban==null||UcgenYukseklik==null){
                    Toast.makeText(requireContext(),"Lütfen alanları eksiksiz doldurun",Toast.LENGTH_SHORT).show()
                    binding.ucgenSnc.text="Lütfen alanları boş bırakmayınız!"
                }else{
                    Toast.makeText(requireContext(),"Başarılı",Toast.LENGTH_SHORT).show()
                    val sonuc=(UcgenYukseklik/2)*UcgenTaban
                    binding.ucgenSnc.text=sonuc.toString()
                }
            }
            binding.daireBtn.setOnClickListener {
                val DaireYariCap=binding.daireYariCap.text.toString().toDoubleOrNull()
                if (DaireYariCap==null){
                    Toast.makeText(requireContext(),"Lütfen alanları eksiksiz doldurun",Toast.LENGTH_SHORT).show()
                    binding.DaireSnc.text="Lütfen alanları boş bırakmayınız!"
                }else{
                    Toast.makeText(requireContext(),"Başarılı",Toast.LENGTH_SHORT).show()
                    val sonuc=3.14*DaireYariCap*2
                    binding.DaireSnc.text=sonuc.toString()
                }
            }
        }catch (e:Exception){
            println(e.localizedMessage)
        }
    }


}