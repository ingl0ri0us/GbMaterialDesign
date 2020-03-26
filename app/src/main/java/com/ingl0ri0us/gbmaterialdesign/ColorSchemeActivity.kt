package com.ingl0ri0us.gbmaterialdesign

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_color_scheme.*

class ColorSchemeActivity : AppCompatActivity() {

    private var themeNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(savedInstanceState != null) {
            themeNumber = savedInstanceState.getInt("Theme")

            when(themeNumber) {
                0 -> setTheme(R.style.AppTheme)
                1 -> setTheme(R.style.AppThemeIndigo)
                2 -> setTheme(R.style.AppThemeOlive)
            }
        }

        setContentView(R.layout.activity_color_scheme)

        button.setOnClickListener{view ->
            Snackbar.make(view, "Green and Red", Snackbar.LENGTH_SHORT).show()
            themeNumber = 0
            recreate()
        }

        button2.setOnClickListener{view ->
            Snackbar.make(view, "Red and Blue", Snackbar.LENGTH_SHORT).show()
            themeNumber = 1
            recreate()
        }

        button3.setOnClickListener{view ->
            Snackbar.make(view, "Grey and Olive", Snackbar.LENGTH_SHORT).show()
            themeNumber = 2
            recreate()
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("Theme", themeNumber)
    }
}