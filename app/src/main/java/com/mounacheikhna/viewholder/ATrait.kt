package com.mounacheikhna.viewholder

import android.widget.TextView

/**
 * Created by mounacheikhna on 03/10/2017.
 */
class ATrait(val a1tv: TextView) : BaseTrait {

    override fun bind(v: String) {
        a1tv.text = v
    }

}