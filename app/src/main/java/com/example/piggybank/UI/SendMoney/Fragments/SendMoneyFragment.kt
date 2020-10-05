package com.example.piggybank.UI.SendMoney.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.send_money_fragment.*

class SendMoneyFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.send_money_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       sendMoneyButton?.setOnClickListener(View.OnClickListener {
           findNavController().navigate(R.id.send_money_to_send_piggybanker)
        })

        sendingHistory?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.send_money_to_history)
        })


    }

    companion object {
        @JvmStatic
        fun newInstance(): SendMoneyFragment {
            val fragment = SendMoneyFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}