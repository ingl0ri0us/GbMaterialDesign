package com.ingl0ri0us.gbmaterialdesign

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_buttons.*

class ButtonsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        setSupportActionBar(toolbar)
        val actionbar = supportActionBar
        actionbar!!.setDisplayHomeAsUpEnabled(true)


        button5.setOnClickListener {
            Snackbar.make(it, "Flat button", Snackbar.LENGTH_SHORT).show()
        }

        button6.setOnClickListener {
            Snackbar.make(it, "Flat button border", Snackbar.LENGTH_SHORT).show()
        }

        button7.setOnClickListener {
            Snackbar.make(it, "Raised button", Snackbar.LENGTH_SHORT).show()
        }

        button8.setOnClickListener {
            Snackbar.make(it, "Raised button background", Snackbar.LENGTH_SHORT).show()
        }

        floatingActionButton.setOnClickListener {
            Snackbar.make(it, "Floating action button", Snackbar.LENGTH_SHORT).show()
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            android.R.id.home -> {
                Log.d("tag", "onOptionsItemSelected: ")
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}