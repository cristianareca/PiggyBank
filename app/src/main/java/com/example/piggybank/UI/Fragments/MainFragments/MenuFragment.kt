package com.example.piggybank.UI.Fragments.MainFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.piggybank.R
import com.example.piggybank.UI.Fragments.SafeFragments.SafeFragment
import kotlinx.android.synthetic.main.menu_fragment.*;


class MenuFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.menu_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        movementsButton?.setOnClickListener(){View.OnClickListener {

        }}
        paymentButton?.setOnClickListener(View.OnClickListener {

        })

        sendButton?.setOnClickListener(View.OnClickListener {

        })

        obligationsButton.setOnClickListener(View.OnClickListener {

        })

        balanceButton?.setOnClickListener(View.OnClickListener {

        })

        safeButton?.setOnClickListener(View.OnClickListener {
            val fragmentManager = fragmentManager
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.container, SafeFragment())
            fragmentTransaction.addToBackStack("Third Transaction")
            fragmentTransaction.commit()
            println("Transicion a Caja Fuerte")
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