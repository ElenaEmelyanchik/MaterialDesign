package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.root_view as rootView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val snackbar = Snackbar.make(
            rootView,
            "Long long long long 12345678989877654322 ntsdlfjsdlfj ;sfkjsd ;lkfjsdl;kfj sdlkjfsdl;fj message",
            Snackbar.LENGTH_LONG
        )
        snackbar.view.apply {
            findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
                .setTextColor(resources.getColor(R.color.colorAccent))
            setBackgroundResource(R.color.colorPrimaryDark)
        }

        snackbar.show()
    }
}
