package com.example.piggybank.ui.obligations.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.add_obligation_fragment.*

class AddObligationFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.add_obligation_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addObligationButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.add_to_obligation)
        })

    }

    companion object {
        @JvmStatic
        fun newInstance(): AddObligationFragment {
            val fragment = AddObligationFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}