package com.example.piggybank.ui.safe.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.piggybank.R
import kotlinx.android.synthetic.main.safe_fragment.*

class AddMoneyToSafeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.add_money_to_safe_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addMoneyToSafeButton?.setOnClickListener(View.OnClickListener {
             })

    }

    companion object {
        @JvmStatic
        fun newInstance(): AddMoneyToSafeFragment {
            val fragment = AddMoneyToSafeFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}