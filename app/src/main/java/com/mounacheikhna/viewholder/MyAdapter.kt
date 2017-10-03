package com.mounacheikhna.viewholder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by mounacheikhna on 03/10/2017.
 */
class MyAdapter : RecyclerView.Adapter<BaseViewHolder>() {

    val viewTypeA : Int = 1
    val viewTypeB : Int  = 2

    val items : List<Array<String>> = arrayListOf(arrayOf("A1", "B1"), arrayOf("A2", "B2"))

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder {
        val traits : MutableList<BaseTrait> = mutableListOf()
        when (viewType) {
            viewTypeA -> {
                val itemView = LayoutInflater.from(parent!!.context).inflate(R.layout.a_item, parent, false)
                traits.add(ATrait(itemView.findViewById(R.id.a1)))
                return BaseViewHolder(itemView, traits)
            }
            viewTypeB -> {
                val itemView = LayoutInflater.from(parent!!.context).inflate(R.layout.b_item, parent, false)
                traits.add(BTrait(itemView.findViewById(R.id.b1)))
                return BaseViewHolder(itemView, traits)
            }
            else -> {
                val itemView = LayoutInflater.from(parent!!.context).inflate(R.layout.common_content_in_item, parent, false)
                return BaseViewHolder(itemView, arrayListOf())
            }
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder?, position: Int) {
        holder?.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
