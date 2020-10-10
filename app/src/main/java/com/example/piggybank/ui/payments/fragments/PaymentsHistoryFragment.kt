package com.example.piggybank.ui.payments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.piggybank.R
import com.example.piggybank.ui.payments.item.PaymentItem
import com.example.piggybank.ui.payments.viewmodel.PaymentsViewModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.payments_history_fragment.*
import kotlinx.android.synthetic.main.with_money_from_safe_fragment.*
import javax.inject.Inject

class PaymentsHistoryFragment : DaggerFragment()  {
    @Inject lateinit var viewModel: PaymentsViewModel
    lateinit var paymentAdapter: GroupAdapter<GroupieViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.payments_history_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       withMoneyFromSafeButton?.setOnClickListener(View.OnClickListener {

       })
        paymentAdapter= GroupAdapter()
        recyclerViewPayments.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        recyclerViewPayments.adapter=paymentAdapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.getPaymentsLiveData().observe(viewLifecycleOwner, Observer { payment ->
            paymentAdapter.addAll(
                    payment.map {
                        PaymentItem(it)
                    }
            )
        })
    }

    companion object {
        @JvmStatic
        fun newInstance(): PaymentsHistoryFragment {
            val fragment = PaymentsHistoryFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}