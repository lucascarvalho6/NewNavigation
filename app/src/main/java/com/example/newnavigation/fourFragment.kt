package com.example.newnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class fourFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_four, container, false)
        view.findViewById<Button>(R.id.btnSix).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fourFragment_to_sixFragment)
        }
        return view
    }
}