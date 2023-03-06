package com.fission.sampleproject.utils

object TextUtils {

    fun isTextEmptyOrNull(text: String?): Boolean {
        if (text != null && text.isEmpty()) {
            return true
        }
        return false
    }
}
