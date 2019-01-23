package com.caesarlib.lathe

import android.util.Log

/**
 * log的工具类
 * created by Caesar on 2019/1/23
 * email : 15757855271@163.com
 */
object LogHelper {
    private var TAG = "LogHelper"
    private var WorkState = false
    fun switch(state: Boolean) {
        WorkState = state
    }

    fun setTAG(tag: String) {
        TAG = tag
    }

    fun T(context: String) {
        if (WorkState) {
            Log.i(TAG, context)
        }
    }

    fun I(tag: String, context: String) {
        if (WorkState) {
            Log.i(tag, context)
        }
    }

}
