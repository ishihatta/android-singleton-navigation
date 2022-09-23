package com.ishihata_tech.navigationwithsingleton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ishihata_tech.navigationwithsingleton.databinding.FragmentABinding

class AFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val binding = FragmentABinding.inflate(layoutInflater, container, false)
        binding.buttonNext.setOnClickListener {
            InputData.getInstance().name = binding.editName.text.toString()
            findNavController().navigate(R.id.action_AFragment_to_BFragment)
        }
        return binding.root
    }
}