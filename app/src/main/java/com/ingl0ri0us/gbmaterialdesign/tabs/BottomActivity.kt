package com.ingl0ri0us.gbmaterialdesign.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ingl0ri0us.gbmaterialdesign.R
import kotlinx.android.synthetic.main.activity_bottom.*

class BottomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)

        replaceFragment(FirstFragment())

        navigation_view.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_camera -> {
                    replaceFragment(FirstFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_gallery -> {
                    replaceFragment(SecondFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_slide -> {
                    replaceFragment(ThirdFragment())
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()
    }
}
