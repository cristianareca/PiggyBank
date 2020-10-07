package com.example.piggybank.ui.safe.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.piggybank.R
import com.example.piggybank.ui.safe.item.SafeItem
import com.example.piggybank.ui.safe.viewModel.SafesViewModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.safe_movements_fragment.*
import kotlinx.android.synthetic.main.with_money_from_safe_fragment.*
import javax.inject.Inject

class SafeMovementsFragment : DaggerFragment() {

    @Inject lateinit var viewModel: SafesViewModel
    lateinit var safesAdapter: GroupAdapter<GroupieViewHolder>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.safe_movements_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        withMoneyFromSafeButton?.setOnClickListener(View.OnClickListener {

        })

        safesAdapter= GroupAdapter()
        recyclerViewSafes.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerViewSafes.adapter = safesAdapter

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getSafesLiveData().observe(viewLifecycleOwner, Observer {safes->
            safesAdapter.addAll(
                    safes.map{
                        SafeItem(it)
                    }
            )
        })

    }


    companion object {
        @JvmStatic
        fun newInstance(): SafeMovementsFragment {
            val fragment = SafeMovementsFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}