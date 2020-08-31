package com.example.piggybank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_historial.*

class History : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_historial, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        generate_his?.setOnClickListener(View.OnClickListener { println("Generando sirve ") })

        volver?.setOnClickListener(View.OnClickListener {
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.container, MenuFragment())
            fragmentTransaction.commit()
        })
    }

    companion object {
        // TODO: Rename and change types and number of parameters
        fun newInstance(): History {
            val fragment = History()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}