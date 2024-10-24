#pragma once

namespace mi_hide_adaptive_icon_stroke {

    static constexpr auto TAG = "MiHideAdaptiveIconStroke/JNI";
    static constexpr auto MODULE_DEX_PATH = "/data/adb/modules/mi_hide_adaptive_icon_stroke/classes.dex";
    static constexpr auto ENTRY_CLASS_NAME = "com.yifeplayte.mihideadaptiveiconstroke.module.Main";

#define LOGD(...)     __android_log_print(ANDROID_LOG_DEBUG, TAG, __VA_ARGS__)
#define LOGI(...)     __android_log_print(ANDROID_LOG_INFO,  TAG, __VA_ARGS__)
#define LOGE(...)     __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__)
#define LOGERRNO(...) __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__ ": %d (%s)", errno, strerror(errno))

}
