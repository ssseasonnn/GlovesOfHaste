package zlc.season.glovesofhaste

import android.widget.Toast

fun <T> T.toast(): T {
    innerToast()
    return this
}


private fun <T> T.innerToast() {
    if (this is Throwable) {
        Toast.makeText(ContextKeeper.get(), this.message ?: "", Toast.LENGTH_SHORT).show()
    } else {
        Toast.makeText(ContextKeeper.get(), this.toString(), Toast.LENGTH_SHORT).show()
    }
}