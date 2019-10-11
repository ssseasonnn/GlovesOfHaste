package zlc.season.glovesofhaste.tricks

import android.util.Log.*

private var DEBUG = true
private var LOG_TAG = "TAG"

fun setLogTag(tag: String) {
    LOG_TAG = tag
}

fun setDebug(flag: Boolean) {
    DEBUG = flag
}

fun <T> T.logd(tag: String = ""): T {
    innerToast(::d, ::d, tag)
    return this
}

fun <T> T.logi(tag: String = ""): T {
    innerToast(::i, ::i, tag)
    return this
}

fun <T> T.logw(tag: String = ""): T {
    innerToast(::w, ::w, tag)
    return this
}

fun <T> T.loge(tag: String = ""): T {
    innerToast(::e, ::e, tag)
    return this
}

fun <T> T.logv(tag: String = ""): T {
    innerToast(::v, ::v, tag)
    return this
}

private fun <T> T.innerToast(
    function1: (String, String, Throwable) -> Int,
    function2: (String, String?) -> Int,
    tag: String
) {
    if (DEBUG) {
        val realTag = if (tag.isNotEmpty()) tag else LOG_TAG
        if (this is Throwable) {
            function1(realTag, this.message ?: "", this)
        } else {
            function2(realTag, this.toString())
        }
    }
}