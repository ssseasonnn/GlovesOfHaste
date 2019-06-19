package zlc.season.glovesofhastedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import zlc.season.glovesofhaste.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = "hhh".toast()
    }
}
