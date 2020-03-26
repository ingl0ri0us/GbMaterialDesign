package com.ingl0ri0us.gbmaterialdesign

import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    fun show(view: View) {
        progress_circular.visibility = View.VISIBLE
        progress_horizontal.visibility = View.VISIBLE
    }

    fun hide(view: View) {
        progress_circular.visibility = View.INVISIBLE
        progress_horizontal.visibility = View.INVISIBLE
    }
}
