package com.fission.sampleproject

import com.fission.sampleproject.utils.TextUtils
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class UtilsTest {

    @Test
    fun emptyNullCheck() {
        Assert.assertFalse(TextUtils.isTextEmptyOrNull("Preethi"))
        Assert.assertTrue(TextUtils.isTextEmptyOrNull(""))
    }
}
