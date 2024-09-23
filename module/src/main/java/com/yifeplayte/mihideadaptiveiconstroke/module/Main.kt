package com.yifeplayte.mihideadaptiveiconstroke.module

import android.annotation.SuppressLint
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.drawable.AdaptiveIconDrawableInjector
import android.util.Log

@Suppress("unused")
@SuppressLint("PrivateApi")
object Main {
    const val TAG = "MiHideAdaptiveIconStroke"

    @JvmStatic
    fun main() {
        runCatching {
            val maskPaintField =
                AdaptiveIconDrawableInjector::class.java
                    .getDeclaredField("MASK_PAINT")
                    .apply { isAccessible = true }
            val maskPaint = maskPaintField.get(null) as Paint
            maskPaint.setXfermode(PorterDuffXfermode(PorterDuff.Mode.DST))
        }.onFailure {
            Log.e(TAG, "Set transfer mode to desitination for MASK_PAINT failed: $it", it)
        }
        runCatching {
            val fullMaskPaintField =
                AdaptiveIconDrawableInjector::class.java
                    .getDeclaredField("FULL_MASK_PAINT")
                    .apply { isAccessible = true }
            val fullMaskPaint = fullMaskPaintField.get(null) as Paint
            fullMaskPaint.setXfermode(PorterDuffXfermode(PorterDuff.Mode.DST))
        }.onFailure {
            Log.e(TAG, "Set transfer mode to desitination for FULL_MASK_PAINT failed: $it", it)
        }
    }
}
