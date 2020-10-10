package com.example.piggybank.ui.movements.item

import com.example.domain.movement.model.Movement
import com.example.piggybank.R
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.movement_list_item.view.*

class MovementItem(val movement: Movement) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.apply {
            movementType.text = movement.movementType
            movementAmount.text = movement.movementAmount
            movementConcept.text = movement.movementConcept
        }
    }

    override fun getLayout() = R.layout.movement_list_item


}