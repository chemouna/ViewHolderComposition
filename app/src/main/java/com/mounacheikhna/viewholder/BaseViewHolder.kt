package com.mounacheikhna.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by mounacheikhna on 03/10/2017.
 */
class BaseViewHolder(val itemView: View, val traits: MutableList<BaseTrait>) : RecyclerView.ViewHolder(itemView) {

    fun bind(strings: Array<String>) {
        traits.forEach { it.bind(strings[0]) }
    }


}