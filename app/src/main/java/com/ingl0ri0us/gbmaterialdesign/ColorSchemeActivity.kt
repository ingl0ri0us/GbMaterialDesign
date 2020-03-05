package com.ingl0ri0us.gbmaterialdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_color_scheme.*

class ColorSchemeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_color_scheme)

        button.setOnClickListener{view ->
            Snackbar.make(view, "Teal and Orange", Snackbar.LENGTH_SHORT).show()
        }

        button2.setOnClickListener{view ->
            Snackbar.make(view, "Red and Blue", Snackbar.LENGTH_SHORT).show()
        }

        button3.setOnClickListener{view ->
            Snackbar.make(view, "Grey and Olive", Snackbar.LENGTH_SHORT).show()
        }

    }
}