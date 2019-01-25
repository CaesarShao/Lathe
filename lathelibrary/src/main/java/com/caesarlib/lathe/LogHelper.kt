package com.caesarlib.lathe

import android.util.Log

/**
 * log的工具类
 * created by Caesar on 2019/1/23
 * email : 15757855271@163.com
 */
object LogHelper {
    private var TAG = "CaesarLogHelper"
    private var WorkState = false
    private val SINGLE_LOG_MAX = 3000
    fun setEnable(state: Boolean) {
        WorkState = state
    }

    fun setTAG(tag: String) {
        TAG = tag
    }

    fun I(string: String) {
        I(TAG, string)
    }

    fun I(tag: String, str: String) {
        if (WorkState) {
            if (StringHelpter.isEmpty(str)) {
                Log.i(tag, "内容为空")
            } else {
                val strCount = StringHelpter.getStringLength(str)
                if (strCount > SINGLE_LOG_MAX) {
                    val chunkCount = strCount / SINGLE_LOG_MAX
                    for (i in 0..chunkCount) {
                        val multipleCount = SINGLE_LOG_MAX * (i + 1)
                        if (multipleCount >= strCount) {
                            Log.i(tag + "chunk " + i + " of " + chunkCount + ":", str.substring(SINGLE_LOG_MAX * i))
                        } else {
                            Log.i(
                                tag + "chunk " + i + " of " + chunkCount + ":",
                                str.substring(SINGLE_LOG_MAX * i, multipleCount)
                            )
                        }
                    }
                } else {
                    Log.i(tag, str)
                }
            }
        }
    }

}
