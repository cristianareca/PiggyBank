package com.example.piggybank.ui.payments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.payments_fragment.*

class PaymentsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.payments_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        makePaymentButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.payments_to_make_payment)
        })

        paymentsHistory?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.payments_to_history)
        })



    }

    companion object {
        // TODO: Rename and change types and number of parameters
        fun newInstance(): PaymentsFragment {
            val fragment = PaymentsFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}