package com.example.mymenuapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mymenuapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

//    // =========== VARIABLES ==============
//    private lateinit var imageItem1: ImageView
//    private lateinit var titleItem1: TextView
//    private lateinit var priceItem1: TextView
//    private lateinit var infoItem1: TextView
//
//    private lateinit var imageItem2: ImageView
//    private lateinit var titleItem2: TextView
//    private lateinit var priceItem2: TextView
//    private lateinit var infoItem2: TextView
//
//    private lateinit var imageItem3: ImageView
//    private lateinit var titleItem3: TextView
//    private lateinit var priceItem3: TextView
//    private lateinit var infoItem3: TextView
//
//    //====================== STARTERS LISTS ======================
//
//    private lateinit var starterImageDescriptionList: List<String>
//    private lateinit var starterTitleList: List<String>
//    private lateinit var starterInfoList: List<String>
//    private lateinit var starterPriceList: List<String>
//
//    //====================== MAINS LISTS ======================
//
//    private lateinit var mainImageDescriptionList: List<String>
//    private lateinit var mainTitleList: List<String>
//    private lateinit var mainInfoList: List<String>
//    private lateinit var mainPriceList: List<String>
//
//
//    //====================== PUDDINGS LISTS ======================
//
//    private lateinit var puddingImageDescriptionList: List<String>
//    private lateinit var puddingTitleList: List<String>
//    private lateinit var puddingInfoList: List<String>
//    private lateinit var puddingPriceList: List<String>
//
//
//    //==================== ACTIVE VIEW LISTS =====================
//
//    private val menuItemImageDescriptionList = mutableListOf<String>()
//    private val menuItemTitleList = mutableListOf<String>()
//    private val menuItemPriceList = mutableListOf<String>()
//    private val menuItemInfoList = mutableListOf<String>()
//
//    // ===========================================================


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val adapter = PagerAdapter(this)
        binding.vpPagerBottom.adapter = adapter

        TabLayoutMediator(binding.tabBottomNavigation, binding.vpPagerBottom)
        { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.starters)
                1 -> getString(R.string.mains)
                2 -> getString(R.string.puddings)
                else -> ""
            }
        }.attach()
        
//
//
//
//
//
//
//
//
//
//
//        //====================== STARTERS LISTS ======================
//        // GETS INFO FROM STRINGS.XML
//
//        starterImageDescriptionList = listOf(
//            getString(R.string.image_description_starter_1),
//            getString(R.string.image_description_starter_2),
//            getString(R.string.image_description_starter_3)
//        )
//
//        starterTitleList = listOf(
//            getString(R.string.title_starter_1),
//            getString(R.string.title_starter_2),
//            getString(R.string.title_starter_3)
//        )
//
//        starterInfoList = listOf(
//            getString(R.string.info_starter_1),
//            getString(R.string.info_starter_2),
//            getString(R.string.info_starter_3)
//        )
//
//        starterPriceList = listOf(
//            getString(R.string.price_starter_1),
//            getString(R.string.price_starter_2),
//            getString(R.string.price_starter_3)
//        )
//
//    //====================== MAINS LISTS ======================
//        // GETS INFO FROM STRINGS.XML
//
//        mainImageDescriptionList = listOf(
//            getString(R.string.image_description_main_1),
//            getString(R.string.image_description_main_2),
//            getString(R.string.image_description_main_3)
//        )
//        mainTitleList = listOf(
//            getString(R.string.title_main_1),
//            getString(R.string.title_main_2),
//            getString(R.string.title_main_3)
//        )
//        mainInfoList = listOf(
//            getString(R.string.info_main_1),
//            getString(R.string.info_main_2),
//            getString(R.string.info_main_3)
//        )
//        mainPriceList = listOf(
//            getString(R.string.price_main_1),
//            getString(R.string.price_main_2),
//            getString(R.string.price_main_3)
//        )
//
//    //====================== PUDDINGS LISTS ======================
//        // GETS INFO FROM STRINGS.XML
//
//        puddingImageDescriptionList = listOf(
//            getString(R.string.image_description_pudding_1),
//            getString(R.string.image_description_pudding_2),
//            getString(R.string.image_description_pudding_3)
//        )
//        puddingTitleList = listOf(
//            getString(R.string.title_pudding_1),
//            getString(R.string.title_pudding_2),
//            getString(R.string.title_pudding_3)
//        )
//        puddingPriceList = listOf(
//            getString(R.string.price_pudding_1),
//            getString(R.string.price_pudding_2),
//            getString(R.string.price_pudding_3)
//        )
//        puddingInfoList = listOf(
//            getString(R.string.info_pudding_1),
//            getString(R.string.info_pudding_2),
//            getString(R.string.info_pudding_3)
//        )
//
//
//
//        // ======= RUNNING FUNCTION =======
//
////                updateMenuList()
//
//
//    }
//
//    // ============== FUNCTION FOR UPDATING THE MENU ==============
//    private fun updateMenuList(position: Int) {
//
//        menuItemImageDescriptionList.clear()
//        menuItemTitleList.clear()
//        menuItemPriceList.clear()
//        menuItemInfoList.clear()
//
//        when (position) {
//            // ====== SETS THE STARTERS MENU ======
//            0 -> {
//                imageItem1.setImageResource(R.drawable.sausage_rolls)
//                imageItem2.setImageResource(R.drawable.scotch_egg)
//                imageItem3.setImageResource(R.drawable.fried_calamari)
//
//                imageItem1.contentDescription = starterImageDescriptionList[0]
//                imageItem2.contentDescription = starterImageDescriptionList[1]
//                imageItem3.contentDescription = starterImageDescriptionList[2]
//
//                menuItemImageDescriptionList.addAll(starterImageDescriptionList)
//                menuItemTitleList.addAll(starterTitleList)
//                menuItemInfoList.addAll(starterInfoList)
//                menuItemPriceList.addAll(starterPriceList)
//            }
//            // ====== SETS THE MAINS MENU ======
//            1 -> {
//                imageItem1.setImageResource(R.drawable.pie_mash)
//                imageItem2.setImageResource(R.drawable.fish_chips)
//                imageItem3.setImageResource(R.drawable.hamburger)
//
//                imageItem1.contentDescription = mainImageDescriptionList[0]
//                imageItem2.contentDescription = mainImageDescriptionList[1]
//                imageItem3.contentDescription = mainImageDescriptionList[2]
//
//                menuItemImageDescriptionList.addAll(mainImageDescriptionList)
//                menuItemTitleList.addAll(mainTitleList)
//                menuItemInfoList.addAll(mainInfoList)
//                menuItemPriceList.addAll(mainPriceList)
//            }
//            // ====== SETS THE PUDDINGS MENU ======
//            2 -> {
//                imageItem1.setImageResource(R.drawable.sticky_toffee_pudding)
//                imageItem2.setImageResource(R.drawable.chocolate_fondant)
//                imageItem3.setImageResource(R.drawable.blackberry_cheesecake)
//
//                imageItem1.contentDescription = puddingImageDescriptionList[0]
//                imageItem2.contentDescription = puddingImageDescriptionList[1]
//                imageItem3.contentDescription = puddingImageDescriptionList[2]
//
//                menuItemImageDescriptionList.addAll(puddingImageDescriptionList)
//                menuItemTitleList.addAll(puddingTitleList)
//                menuItemInfoList.addAll(puddingInfoList)
//                menuItemPriceList.addAll(puddingPriceList)
//            }
//        }
//
//        // ====== SETS THE XML TEXT VIEWS ======
//        titleItem1.text = menuItemTitleList[0]
//        titleItem2.text = menuItemTitleList[1]
//        titleItem3.text = menuItemTitleList[2]
//
//        priceItem1.text = menuItemPriceList[0]
//        priceItem2.text = menuItemPriceList[1]
//        priceItem3.text = menuItemPriceList[2]
//
//        infoItem1.text = menuItemInfoList[0]
//        infoItem2.text = menuItemInfoList[1]
//        infoItem3.text = menuItemInfoList[2]
//
//    }


    }
}