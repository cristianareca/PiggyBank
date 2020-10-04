package com.example.piggybank.UI.Fragments.ObligationsFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.piggybank.R
import kotlinx.android.synthetic.main.movements_fragment.*

class ObligationsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.obligations_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registerEntryButton?.setOnClickListener(View.OnClickListener {

        })

        registerExpenseButton?.setOnClickListener(View.OnClickListener {

        })

        movementsHistoryButton.setOnClickListener(View.OnClickListener {

        })

    }

    companion object {
        // TODO: Rename and change types and number of parameters
        fun newInstance(): ObligationsFragment {
            val fragment = ObligationsFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}