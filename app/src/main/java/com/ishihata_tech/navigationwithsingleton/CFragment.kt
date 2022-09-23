package com.ishihata_tech.navigationwithsingleton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ishihata_tech.navigationwithsingleton.databinding.FragmentCBinding

class CFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentCBinding.inflate(layoutInflater, container, false)
        binding.textInputName.text = InputData.getInstance().name
        binding.textInputEmail.text = InputData.getInstance().email
        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }
}