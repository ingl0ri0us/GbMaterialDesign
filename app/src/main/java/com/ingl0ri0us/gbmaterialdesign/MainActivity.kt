package com.ingl0ri0us.gbmaterialdesign

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.ingl0ri0us.gbmaterialdesign.tabs.BottomActivity
import com.ingl0ri0us.gbmaterialdesign.tabs.TabsActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val bottomSheetBehavior = BottomSheetBehavior.from(bottom_sheet)

        button4.setOnClickListener { view ->
            val textToShow = when (edit_text.text.toString().length) {
                0 -> "please enter some text"
                in 11..100 -> "enter shorter text"
                else -> edit_text.text.toString()
            }

            Snackbar.make(
                view,
                textToShow,
                Snackbar.LENGTH_SHORT
            ).show()
        }

        button9.setOnClickListener {
            startActivity(Intent(this, ButtonsActivity::class.java))
        }

        button10.setOnClickListener {
            startActivity(Intent(this, NavigationDrawerActivity::class.java))
        }

        button11.setOnClickListener {
            startActivity(Intent(this, ProgressBarActivity::class.java))
        }

        button12.setOnClickListener {
            startActivity(Intent(this, ScrollingActivity::class.java))
        }

        button13.setOnClickListener {
            startActivity(Intent(this, RecyclerviewActivity::class.java))
        }

        button14.setOnClickListener {
            startActivity(Intent(this, TabsActivity::class.java))
        }

        button15.setOnClickListener {
            startActivity(Intent(this, BottomActivity::class.java))
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> {
                val intent = Intent(this, ColorSchemeActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
