package zlc.season.glovesofhaste.base

import android.graphics.Color.TRANSPARENT
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.fragment.app.DialogFragment

class BaseDialog : DialogFragment() {

    override fun onStart() {
        super.onStart()
        dialog?.window?.let {
            val windowParams = it.attributes
            windowParams.dimAmount = 0f
            it.attributes = windowParams

            it.setGravity(Gravity.BOTTOM)
            it.setLayout(MATCH_PARENT, WRAP_CONTENT)
            it.setBackgroundDrawable(ColorDrawable(TRANSPARENT))
        }
    }
}