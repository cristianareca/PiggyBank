package com.example.piggybank.UI.Fragments.MainFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.piggybank.R
import kotlinx.android.synthetic.main.registration_fragment.*

class RegistrationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.registration_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registerButton?.setOnClickListener(View.OnClickListener {
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.container, MenuFragment())
            fragmentTransaction.addToBackStack("Second Transaction")
            println("Transición a Menú")
            fragmentTransaction.commit()

        })

    }

    companion object {
        fun newInstance(): RegistrationFragment {
            val fragment = RegistrationFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}