package com.emirhan.multipurposecalculator.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.emirhan.multipurposecalculator.adapter.adapter
import com.emirhan.multipurposecalculator.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {
    private var _binding: FragmentMenuBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    companion object {
        fun newInstance(): MenuFragment {
            return MenuFragment()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val view = binding.root
        return view


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding=FragmentMenuBinding.bind(view)
        val navController=findNavController()
        val fragment = MenuFragment.newInstance()


        val menuItems= listOf(
            hesapMakinesiData(
                "clasicCalculator",
                MenuFragmentDirections.actionMenuFragmentToClasicCalculator()

            ),
            hesapMakinesiData(
                "GradeCalculation",
                MenuFragmentDirections.actionMenuFragmentToGradeCalculation()
            ),
            hesapMakinesiData(
                "areaCalculation",
                MenuFragmentDirections.actionMenuFragmentToAreaCalculation()
            )
        )
        val adapter= adapter(menuItems,navController)
        binding.menuRec.layoutManager=LinearLayoutManager(requireContext())
        binding.menuRec.adapter=adapter

    }
}