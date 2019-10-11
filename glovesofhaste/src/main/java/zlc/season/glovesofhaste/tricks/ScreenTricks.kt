package zlc.season.glovesofhaste.tricks

import android.content.res.Resources

/**
 * Convert px to dp.
 * Example: 10.dp means converting 10 pixels to dp value
 */
val Int.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()

/**
 * Convert dp to px.
 * Example: 10.px means converting 10 dp to pixels value
 */
val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()


/**
 * Convert px to dp
 */
val Float.dp: Float
    get() = (this / Resources.getSystem().displayMetrics.density)

/**
 * Convert dp to px
 */
val Float.px: Float
    get() = (this * Resources.getSystem().displayMetrics.density)
