package com.tarrk.dagger2sample

import android.app.Application
import com.tarrk.dagger2sample.util.L

/**
 * User: Pavel
 * Date: 24.11.2017
 * Time: 17:12
 */
class App : Application() {

    init {
        L.plant(L.DebugTree())
    }

}