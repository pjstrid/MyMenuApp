package com.example.mymenuapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> StartersMenu()
            1 -> MainsMenu()
            2 -> PuddingsMenu()
            else -> StartersMenu()
        }
    }

    override fun getItemCount(): Int = 3
}