package com.example.piggybank.ui.obligations.item

import com.example.domain.obligation.model.Obligation
import com.example.piggybank.R
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.obligations_list.view.*

class ObligationItem(val obligation: Obligation) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.apply {
            obligationConcept.text = obligation.ObligationConcept
            obligationAmount.text = obligation.obligationMount
            obligationDate.text = obligation.obligationDate
        }
    }

        override fun getLayout() = R.layout.obligations_list


}