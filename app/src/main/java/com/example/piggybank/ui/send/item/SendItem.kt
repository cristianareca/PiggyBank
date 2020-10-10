package com.example.piggybank.ui.send.item

import com.example.domain.send.model.Send
import com.example.piggybank.R
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.send_list_fragment.view.*

class SendItem(val send: Send) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.apply {
            sendName.text = send.sendPiggiBanker
            sendAmount.text = send.sendAmount
            sendDate.text = send.sendDate
        }
    }

    override fun getLayout() = R.layout.send_list_fragment


}