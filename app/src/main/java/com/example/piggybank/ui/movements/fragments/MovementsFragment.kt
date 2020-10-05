package com.example.piggybank.ui.movements.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.movements_fragment.*

class MovementsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.movements_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registerEntryButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.movements_to_entry)
        })

        registerExpenseButton?.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.movements_to_expense)
        })

        movementsHistoryButton.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.movements_to_history)
        })

    }

    companion object {
        // TODO: Rename and change types and number of parameters
        fun newInstance(): MovementsFragment {
            val fragment = MovementsFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}