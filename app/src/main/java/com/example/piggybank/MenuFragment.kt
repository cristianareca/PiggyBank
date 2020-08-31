package com.example.piggybank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_menu.*;


class MenuFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        safeButton?.setOnClickListener(View.OnClickListener {
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.container, CajaFuerteFragment())
            fragmentTransaction.addToBackStack("Third Transaction")
            fragmentTransaction.commit()
            println("Transicion a Caja Fuerte")
        })

        historyButton?.setOnClickListener(View.OnClickListener {
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.container, History())
            fragmentTransaction.addToBackStack("Fourth Transaction")
            fragmentTransaction.commit()
            println("Transicion a Historial")

        })
    }

    companion object {
        @JvmStatic
        fun newInstance(): MenuFragment {
            val fragment = MenuFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}