package com.example.piggybank.ui.send.item

import com.example.domain.movement.model.Movement
import com.example.domain.send.model.Sending
import com.example.piggybank.R
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.sending_list_item.view.*

class SendingItem(val sending:Sending) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.apply {
            piggybanker.text = sending.piggybanker
            sendAmount.text = sending.sendAmount
            sendDate.text= sending.sendDate
        }
    }

    override fun getLayout() = R.layout.sending_list_item


}