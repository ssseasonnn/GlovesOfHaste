package zlc.season.glovesofhaste

import android.annotation.SuppressLint
import android.content.Context
import java.util.concurrent.atomic.AtomicBoolean

@SuppressLint("StaticFieldLeak")
object ContextKeeper {
    private val initialized = AtomicBoolean(false)

    private lateinit var context: Context

    fun get(): Context {
        if (::context.isInitialized) {
            return context
        } else {
            throw IllegalStateException("Context not initialized!")
        }
    }

    fun init(context: Context) {
        if (initialized.getAndSet(true)) {
            return
        }
        this.context = context.applicationContext
    }
}