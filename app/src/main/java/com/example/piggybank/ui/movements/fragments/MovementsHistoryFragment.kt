package com.example.piggybank.ui.movements.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.piggybank.R
import com.example.piggybank.ui.movements.Adapter.Items.MovementItem
import com.example.piggybank.ui.movements.MovementsViewModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.movements_history_fragment.*
import kotlinx.android.synthetic.main.with_money_from_safe_fragment.*
import javax.inject.Inject

class MovementsHistoryFragment : DaggerFragment() {

    @Inject lateinit var viewModel: MovementsViewModel
    lateinit var movementsAdapter: GroupAdapter<GroupieViewHolder>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.movements_history_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       withMoneyFromSafeButton?.setOnClickListener(View.OnClickListener {

       })

        movementsAdapter= GroupAdapter()

        recyclerViewMovements.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerViewMovements.adapter= movementsAdapter

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getMovementsLiveData().observe(viewLifecycleOwner, Observer {movements->
            movementsAdapter.addAll(
                    movements.map{
                        MovementItem(it)
                    }
            )
        })
    }




    companion object {
        @JvmStatic
        fun newInstance(): MovementsHistoryFragment {
            val fragment = MovementsHistoryFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}