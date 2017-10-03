package com.mounacheikhna.viewholder

import android.widget.TextView

/**
 * Created by mounacheikhna on 03/10/2017.
 */
class BTrait(val b1tv: TextView) : BaseTrait {

    override fun bind(v: String) {
        b1tv.text = v
    }
}