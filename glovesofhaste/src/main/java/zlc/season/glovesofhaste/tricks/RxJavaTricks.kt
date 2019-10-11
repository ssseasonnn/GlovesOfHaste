package zlc.season.glovesofhaste.tricks

import io.reactivex.disposables.Disposable
import io.reactivex.plugins.RxJavaPlugins

fun setErrorHandler(block: (Throwable) -> Unit) {
    RxJavaPlugins.setErrorHandler(block)
}

fun Disposable?.safeDispose() {
    this?.apply {
        if (!isDisposed) {
            dispose()
        }
    }
}

