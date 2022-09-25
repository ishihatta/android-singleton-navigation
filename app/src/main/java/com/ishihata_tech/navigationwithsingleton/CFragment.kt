package com.ishihata_tech.navigationwithsingleton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ishihata_tech.navigationwithsingleton.databinding.FragmentCBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CFragment : Fragment() {
    @Inject
    lateinit var inputData: InputData

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentCBinding.inflate(layoutInflater, container, false)
        binding.textInputName.text = inputData.name
        binding.textInputEmail.text = inputData.email
        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }
}