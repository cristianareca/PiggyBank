package com.example.piggybank

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_caja_fuerte.Atras;
import kotlinx.android.synthetic.main.fragment_caja_fuerte.Sumar;
import kotlinx.android.synthetic.main.fragment_caja_fuerte.Restar;
import kotlinx.android.synthetic.main.fragment_caja_fuerte.Guardar;

class CajaFuerteFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_caja_fuerte, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Sumar?.setOnClickListener(View.OnClickListener { println("Se sumo con exito") })

        Restar?.setOnClickListener(View.OnClickListener { println("Se resto con exito") })

        Guardar?.setOnClickListener(View.OnClickListener { println("Se guardo") })

        Atras?.setOnClickListener(View.OnClickListener {
            println("Chao pescao")
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.container, MenuFragment.newInstance())
            fragmentTransaction.addToBackStack("Last Transaction")
            fragmentTransaction.commit()
        })
    }

    companion object {
        @JvmStatic
        fun newInstance(): CajaFuerteFragment {
            val fragment = CajaFuerteFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}