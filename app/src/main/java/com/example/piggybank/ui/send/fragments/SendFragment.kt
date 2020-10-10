package com.example.piggybank.ui.send.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.send_money_fragment.*

class SendFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.send_money_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sendMoneyButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.send_piggybanker_fragment)
        })

        sendingHistory?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.sending_history)
        })
    }

    companion object {
        fun newInstance(): SendFragment {
            val fragment = SendFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}