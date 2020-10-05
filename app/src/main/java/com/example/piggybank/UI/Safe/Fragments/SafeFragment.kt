package com.example.piggybank.UI.Safe.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.safe_fragment.*;

class SafeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.safe_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addMoneyToSafeButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.safe_to_add)
        })

        withdrawMoneyFromSafeButton.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.safe_to_with)
        })

        safeHistoryButton.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.safe_to_movements);
        })

    }

    companion object {
        @JvmStatic
        fun newInstance(): SafeFragment {
            val fragment = SafeFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}