package com.example.piggybank.UI.Movements.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.register_expense_fragment.*

class RegisterExpenseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.register_expense_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       addExpense?.setOnClickListener(View.OnClickListener {
           findNavController().navigate(R.id.expense_to_movements)
       })

    }

    companion object {
        @JvmStatic
        fun newInstance(): RegisterExpenseFragment {
            val fragment = RegisterExpenseFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}