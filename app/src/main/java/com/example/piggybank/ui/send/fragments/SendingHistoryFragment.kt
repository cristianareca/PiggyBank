package com.example.piggybank.ui.send.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.piggybank.R
import com.example.piggybank.ui.movements.item.MovementItem
import com.example.piggybank.ui.movements.viewModel.MovementsViewModel
import com.example.piggybank.ui.send.item.SendingItem
import com.example.piggybank.ui.send.viewModel.SendingsViewModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.movements_history_fragment.*
import kotlinx.android.synthetic.main.sending_history_fragment.*
import kotlinx.android.synthetic.main.with_money_from_safe_fragment.*
import javax.inject.Inject

class SendingHistoryFragment :DaggerFragment() {
    @Inject lateinit var viewModel: SendingsViewModel
    lateinit var sendingsAdapter: GroupAdapter<GroupieViewHolder>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.sending_history_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sendingsAdapter= GroupAdapter()

        recyclerViewSendings.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        recyclerViewSendings.adapter= sendingsAdapter


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.getSendingsLiveData().observe(viewLifecycleOwner, Observer {sendings->
            sendingsAdapter.addAll(
                    sendings.map{
                       SendingItem(it)
                    }
            )
        })
    }

    companion object {
        @JvmStatic
        fun newInstance(): SendingHistoryFragment {
            val fragment = SendingHistoryFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}