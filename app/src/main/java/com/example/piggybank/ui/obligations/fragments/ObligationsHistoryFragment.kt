package com.example.piggybank.ui.obligations.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.domain.obligation.model.Obligation
import com.example.piggybank.R
import com.example.piggybank.ui.obligations.item.ObligationItem
import com.example.piggybank.ui.obligations.viewModel.ObligationViewModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.obligations_history_fragment.*
import kotlinx.android.synthetic.main.with_money_from_safe_fragment.*
import javax.inject.Inject

class ObligationsHistoryFragment : DaggerFragment() {

    @Inject lateinit var viewModel: ObligationViewModel
    lateinit var obligationAdapter: GroupAdapter<GroupieViewHolder>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.obligations_history_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        withMoneyFromSafeButton?.setOnClickListener(View.OnClickListener {

        })

        obligationAdapter= GroupAdapter()

        recyclerViewObligation.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerViewObligation.adapter= obligationAdapter

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getObligationLiveData().observe(viewLifecycleOwner, Observer { obligation->
            obligationAdapter.addAll(
                    obligation.map{
                        ObligationItem(it)
                    }
            )
        })
    }
    companion object {
        @JvmStatic
        fun newInstance(): ObligationsHistoryFragment {
            val fragment = ObligationsHistoryFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}