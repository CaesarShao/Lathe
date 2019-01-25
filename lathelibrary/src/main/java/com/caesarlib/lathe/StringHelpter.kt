package com.caesarlib.lathe

/**
 * 字符串工具类
 * created by Caesar on 2019/1/24
 * email : 15757855271@163.com
 */
object StringHelpter {
    fun isEmpty(str: String?): Boolean {
        return str == null || str.isEmpty()
    }

    fun getStringLength(str: String?): Int {
        return if (isEmpty(str)) 0 else str!!.length
    }
}
