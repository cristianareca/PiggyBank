package com.example.piggybank.ui.safe.item

import com.example.domain.safe.model.Safe
import com.example.piggybank.R
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.safe_list_item.view.*

class SafeItem(val safe: Safe) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.apply {
            safeAmount.text = safe.safeAmount
            safeConcept.text = safe.safeConcept
            safeDate.text = safe.safeDate
        }
    }

    override fun getLayout() = R.layout.safe_list_item


}