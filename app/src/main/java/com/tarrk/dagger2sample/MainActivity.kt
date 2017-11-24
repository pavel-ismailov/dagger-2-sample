package com.tarrk.dagger2sample

import android.support.v7.app.AppCompatActivity
import com.tarrk.dagger2sample.manager.LuckManager
import com.tarrk.dagger2sample.util.L

/**
 * User: Pavel
 * Date: 24.11.2017
 * Time: 17:13
 */
class MainActivity: AppCompatActivity() {

    init {
        L.i("init", "current luck is", LuckManager.calculateLuck(1984, 5, 14).toString())
    }

}