package com.example.piggybank.UI.Fragments.PaymentFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.make_payment_fragment.*

class MakePaymentFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.make_payment_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        makePaymentButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.make_payment_to_payments)
        })



    }

    companion object {
        // TODO: Rename and change types and number of parameters
        fun newInstance(): MakePaymentFragment {
            val fragment = MakePaymentFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}