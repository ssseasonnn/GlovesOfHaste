package zlc.season.glovesofhaste


import android.util.Log.*
import android.widget.Toast

private var DEBUG = true
private var LOG_TAG = "TAG"

fun setLogTag(tag: String) {
    LOG_TAG = tag
}

fun setDebug(flag: Boolean) {
    DEBUG = flag
}

fun <T> T.toast(tag: String = ""): T {
    Toast.makeText()
    return this
}


fun <T> T.logi(tag: String = ""): T {
    innerLog(::i, ::i, tag)
    return this
}

fun <T> T.logw(tag: String = ""): T {
    innerLog(::w, ::w, tag)
    return this
}

fun <T> T.loge(tag: String = ""): T {
    innerLog(::e, ::e, tag)
    return this
}

fun <T> T.logv(tag: String = ""): T {
    innerLog(::v, ::v, tag)
    return this
}

private fun <T> T.innerLog(
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