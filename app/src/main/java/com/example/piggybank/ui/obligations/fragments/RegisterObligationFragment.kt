package com.example.piggybank.ui.obligations.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.piggybank.R
import kotlinx.android.synthetic.main.register_entry_fragment.*

class RegisterObligationFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.register_entry_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       addEntry?.setOnClickListener(View.OnClickListener {
             })

    }

    companion object {
        @JvmStatic
        fun newInstance(): RegisterObligationFragment {
            val fragment = RegisterObligationFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}