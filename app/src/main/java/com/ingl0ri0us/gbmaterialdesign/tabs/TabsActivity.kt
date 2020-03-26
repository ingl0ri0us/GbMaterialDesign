package com.ingl0ri0us.gbmaterialdesign.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.ingl0ri0us.gbmaterialdesign.R
import kotlinx.android.synthetic.main.activity_tabs.*

class TabsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabs)

        val fragment1 = FirstFragment.newInstance()
        val fragment2 = SecondFragment.newInstance()
        val fragment3 = ThirdFragment.newInstance()

        val tabsAdapter = TabsAdapter(supportFragmentManager)
        tabsAdapter.addFragment(fragment1, "tab1")
        tabsAdapter.addFragment(fragment2, "tab2")
        tabsAdapter.addFragment(fragment3, "tab3")

        tabs_pager.adapter = tabsAdapter
        tabs_tabNames.setupWithViewPager(tabs_pager)
    }
}
