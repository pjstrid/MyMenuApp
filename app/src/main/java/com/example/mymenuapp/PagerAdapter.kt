package com.example.mymenuapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(val activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> StartersMenu.newInstance(
                R.drawable.sausage_rolls,
                activity.getString(R.string.image_description_starter_1),
                activity.getString(R.string.title_starter_1),
                activity.getString(R.string.info_starter_1),
                activity.getString(R.string.price_starter_1),


                R.drawable.scotch_egg,
                activity.getString(R.string.image_description_starter_2),
                activity.getString(R.string.title_starter_2),
                activity.getString(R.string.info_starter_2),
                activity.getString(R.string.price_starter_2),


                R.drawable.fried_calamari,
                activity.getString(R.string.image_description_starter_3),
                activity.getString(R.string.title_starter_3),
                activity.getString(R.string.info_starter_3),
                activity.getString(R.string.price_starter_3)
            )
            1 -> MainsMenu()
            2 -> PuddingsMenu()
            else -> StartersMenu()
        }
    }

    override fun getItemCount(): Int = 3
}