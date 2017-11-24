package com.tarrk.dagger2sample.manager

import com.tarrk.dagger2sample.util.plusOne
import com.tarrk.dagger2sample.util.plusTwo

/**
 * User: Pavel
 * Date: 24.11.2017
 * Time: 17:33
 */
object DevilMoodManager {

    fun getMoodRange(): Int {
        return (Math.random() * 10).toInt()
    }

}