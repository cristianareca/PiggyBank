package com.example.piggybank.ui.safe.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.piggybank.R
import kotlinx.android.synthetic.main.with_money_from_safe_fragment.*

class WithMoneyFromSafeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.with_money_from_safe_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       withMoneyFromSafeButton?.setOnClickListener(View.OnClickListener {
             })

    }

    companion object {
        @JvmStatic
        fun newInstance(): WithMoneyFromSafeFragment {
            val fragment = WithMoneyFromSafeFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}