package com.example.piggybank.UI.Movements.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.piggybank.Data.Movement
import com.example.piggybank.R
import com.example.piggybank.UI.Movements.Adapter.Items.MovementItem
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.movements_history_fragment.*
import kotlinx.android.synthetic.main.with_money_from_safe_fragment.*

class MovementsHistoryFragment : Fragment() {

    lateinit var movementsAdapter: GroupAdapter<GroupieViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.movements_history_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       withMoneyFromSafeButton?.setOnClickListener(View.OnClickListener {

       })

        movementsAdapter= GroupAdapter()
        movementsAdapter.addAll(
                getMovementsList.map {
                        MovementItem(it)
                }
        )
        recyclerViewMovements.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerViewMovements.adapter= movementsAdapter

    }

    private val getMovementsList = listOf(
            Movement ("Ingreso","15000","Salario"),
            Movement ("Egreso","15000","Salario"),
            Movement ("Ingreso","15000","Salario"),
            Movement ("Egreso","15000","Salario"),
            Movement ("Ingreso","15000","Salario"),
            Movement ("Egreso","15000","Salario"),

    )



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