package com.example.rexburgrestaurants

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class bottomsheet_fragment : BottomSheetDialogFragment() {
    private var titleText: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottomsheet_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        titleText = view.findViewById<TextView>(R.id.title)

    }

    fun updateText(title: String?){
        println(title)
        println(titleText?.getText())
        titleText?.text = title
        println(titleText?.getText())
    }
}

