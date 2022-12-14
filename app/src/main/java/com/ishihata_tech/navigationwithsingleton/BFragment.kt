package com.ishihata_tech.navigationwithsingleton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ishihata_tech.navigationwithsingleton.databinding.FragmentBBinding

class BFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentBBinding.inflate(layoutInflater, container, false)
        binding.buttonNext.setOnClickListener {
            InputData.getInstance().email = binding.editEmail.text.toString()
            findNavController().navigate(R.id.action_BFragment_to_CFragment)
        }
        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }
}