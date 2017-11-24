package com.tarrk.dagger2sample.manager

import com.tarrk.dagger2sample.util.plusOne
import com.tarrk.dagger2sample.util.plusTwo

/**
 * User: Pavel
 * Date: 24.11.2017
 * Time: 17:33
 */
object LuckManager {

    fun calculateLuck(birthYear: Int, birthMonth: Int, birthDate: Int): Boolean {

        return plusOne(birthYear) +
                plusTwo(birthMonth) +
                plusOne(birthDate) +
                plusOne(DevilMoodManager.getMoodRange()) % 2 == 0

    }

}