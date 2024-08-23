package com.emirhan.multipurposecalculator.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.emirhan.multipurposecalculator.R
import com.emirhan.multipurposecalculator.databinding.FragmentGradeCalculationBinding
import com.emirhan.multipurposecalculator.databinding.FragmentMenuBinding


class GradeCalculation : Fragment() {
    private var _binding: FragmentGradeCalculationBinding? = null
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
        _binding = FragmentGradeCalculationBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding=FragmentGradeCalculationBinding.bind(view)

        binding.notBtn.setOnClickListener {
            val not1=binding.vize.text.toString().toDoubleOrNull()
            val not2=binding.fnl.text.toString().toDoubleOrNull()
            if (not1==null||not2==null){
                Toast.makeText(requireContext(),"Lütfen vize veya final not girişlerinizi yapınız.",Toast.LENGTH_SHORT).show()
            }else{
                val sonuc=not1*0.4+not2*0.6
                binding.notSnc.text=sonuc.toString()
                if (sonuc>45&&sonuc<50){
                    binding.notHrfSnc.text="DC:Koşullu Başarılı"
                }else if (sonuc>60.0&&sonuc<70){
                    binding.notHrfSnc.text="CC:Başarılı ama bir daha böyle olmasın."
                }else if (sonuc>70.0&&sonuc<80){
                    binding.notHrfSnc.text="CB Başarılı derslerine düzenli çalışmaya devam."
                }else if (sonuc>80.0&&sonuc<90){
                    binding.notHrfSnc.text="BB: Başarılı dostum basss!"
                }else if (sonuc>=90){
                    binding.notHrfSnc.text="AA: Aferin dostum."
                }
            }
        }

    }


}