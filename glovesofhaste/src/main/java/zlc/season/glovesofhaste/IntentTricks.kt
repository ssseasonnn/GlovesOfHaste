package zlc.season.glovesofhaste

import android.content.Intent
import android.os.Parcelable
import java.io.Serializable

operator fun Intent.get(key: String, defaultValue: String = ""): String {
    return this.getStringExtra(key) ?: defaultValue
}

operator fun Intent.get(key: String, defaultValue: Boolean = false): Boolean {
    return this.getBooleanExtra(key, defaultValue)
}

operator fun Intent.get(key: String, defaultValue: Int = 0): Int {
    return this.getIntExtra(key, defaultValue)
}

operator fun Intent.get(key: String, defaultValue: Long = 0L): Long {
    return this.getLongExtra(key, defaultValue)
}

operator fun Intent.get(key: String, defaultValue: Float = 0f): Float {
    return this.getFloatExtra(key, defaultValue)
}

operator fun Intent.get(key: String, defaultValue: Double = 0.0): Double {
    return this.getDoubleExtra(key, defaultValue)
}

operator fun <T : Serializable> Intent.get(key: String, defaultValue: T? = null): T? {
    return this.getSerializableExtra(key) as T? ?: defaultValue
}

operator fun <T : Parcelable> Intent.get(key: String, defaultValue: T? = null): T? {
    return this.getParcelableExtra(key) ?: defaultValue
}



