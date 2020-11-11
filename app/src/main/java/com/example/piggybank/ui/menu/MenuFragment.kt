package com.example.piggybank.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.menu_fragment.*


class MenuFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.menu_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        movementsButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.menu_to_movements)

        })
        paymentButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.menu_to_payments)
        })

        sendButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.menu_to_send_money)
        })

        obligationsButton.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.menu_to_obligations)
        })


        safeButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.menu_to_safe)
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