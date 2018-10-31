package com.hlf.base.module.utils

import android.util.Log
import com.hlf.base.module.constant.BaseConstans

/**
 * Log输出工具类
 */
object LogUtils {
    private val isOpenLog = BaseConstans.isOpenLog

    fun v(messag: String) {
        if (isOpenLog)
            Log.v(getTag(Throwable().stackTrace), messag)
    }

    fun d(messag: String) {
        if (isOpenLog)
            Log.d(getTag(Throwable().stackTrace), messag)
    }

    fun i(messag: String) {
        if (isOpenLog)
            Log.i(getTag(Throwable().stackTrace), messag)
    }

    fun w(messag: String) {
        if (isOpenLog)
            Log.w(getTag(Throwable().stackTrace), messag)
    }

    fun e(messag: String) {
        if (isOpenLog)
            Log.e(getTag(Throwable().stackTrace), messag)
    }

    fun getTag(sElements: Array<StackTraceElement>): String {
        val className = sElements[1].fileName
        val methodName = sElements[1].methodName
        val lineNumber = sElements[1].lineNumber
        return "==$className:$methodName:$lineNumber=="
    }

}