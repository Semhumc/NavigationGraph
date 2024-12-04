package com.example.navigation_test.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navigation_test.R

class firstFragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val button1 : Button = view.findViewById(R.id.button)
        val button2 : Button = view.findViewById(R.id.button2)


        button1.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment3)
        }

        button2.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment3)
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


        return inflater.inflate(R.layout.fragment_first, container, false)


    }



}