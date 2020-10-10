package com.example.piggybank.ui.send.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.piggybank.R
import com.example.piggybank.ui.send.item.SendItem
import com.example.piggybank.ui.send.viewModel.SendViewModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.sending_history_fragment.*
import kotlinx.android.synthetic.main.with_money_from_safe_fragment.*
import javax.inject.Inject

class SendHistoryFragment : DaggerFragment() {

    @Inject lateinit var viewModel: SendViewModel
    lateinit var sendAdapter: GroupAdapter<GroupieViewHolder>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.sending_history_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       withMoneyFromSafeButton?.setOnClickListener(View.OnClickListener {

       })

        sendAdapter= GroupAdapter()

        recyclerViewSend.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerViewSend.adapter= sendAdapter

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getSendLiveData().observe(viewLifecycleOwner, Observer {send->
            sendAdapter.addAll(
                    send.map{
                        SendItem(it)
                    }
            )
        })
    }
    companion object {
        @JvmStatic
        fun newInstance(): SendHistoryFragment {
            val fragment = SendHistoryFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}