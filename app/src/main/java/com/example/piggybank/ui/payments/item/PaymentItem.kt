package com.example.piggybank.ui.payments.item

import com.example.domain.payment.model.Payment
import com.example.piggybank.R
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.payments_list_item.view.*
class PaymentItem(val payment: Payment) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.apply {
            paymentConcept.text = payment.paymentConcept
            paymentAmount.text = payment.paymentAmount

        }
    }

    override fun getLayout() = R.layout.payments_list_item


}