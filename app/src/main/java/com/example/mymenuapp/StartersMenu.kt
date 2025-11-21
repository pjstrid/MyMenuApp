package com.example.mymenuapp

import android.accessibilityservice.GestureDescription
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

private const val ARG_IMAGE_1 = "image1"
private const val ARG_IMAGE_DESCRIPTION_1 = "image description 1"
private const val ARG_TITLE_1 = "title1"
private const val ARG_INFO_1 = "info1"
private const val ARG_PRICE_1 = "price1"

private const val ARG_IMAGE_2 = "image2"
private const val ARG_IMAGE_DESCRIPTION_2 = "image_description_2"
private const val ARG_TITLE_2 = "title2"
private const val ARG_INFO_2 = "info2"
private const val ARG_PRICE_2 = "price2"

private const val ARG_IMAGE_3 = "image3"
private const val ARG_IMAGE_DESCRIPTION_3 = "image_description_3"
private const val ARG_TITLE_3 = "title3"
private const val ARG_INFO_3 = "info3"
private const val ARG_PRICE_3 = "price3"

class StartersMenu : Fragment(R.layout.fragment_starters_menu) {
    // =========== VARIABLES ==============
    private lateinit var imageItem1: ImageView
    private lateinit var titleItem1: TextView
    private lateinit var infoItem1: TextView
    private lateinit var priceItem1: TextView

    private lateinit var imageItem2: ImageView
    private lateinit var titleItem2: TextView
    private lateinit var infoItem2: TextView
    private lateinit var priceItem2: TextView

    private lateinit var imageItem3: ImageView
    private lateinit var titleItem3: TextView
    private lateinit var infoItem3: TextView
    private lateinit var priceItem3: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //=============== CONNECT WITH XML FILE ===============

        imageItem1 = view.findViewById(R.id.starter_image_item_1)
        imageItem2 = view.findViewById(R.id.starter_image_item_2)
        imageItem3 = view.findViewById(R.id.starter_image_item_3)

        titleItem1 = view.findViewById(R.id.starter_title_item_1)
        titleItem2 = view.findViewById(R.id.starter_title_item_2)
        titleItem3 = view.findViewById(R.id.starter_title_item_3)

        infoItem1 = view.findViewById(R.id.starter_info_item_1)
        infoItem2 = view.findViewById(R.id.starter_info_item_2)
        infoItem3 = view.findViewById(R.id.starter_info_item_3)

        priceItem1 = view.findViewById(R.id.starter_price_item_1)
        priceItem2 = view.findViewById(R.id.starter_price_item_2)
        priceItem3 = view.findViewById(R.id.starter_price_item_3)

        arguments?.let {
            imageItem1.setImageResource(it.getInt(ARG_IMAGE_1))
            imageItem1.contentDescription = it.getString(ARG_IMAGE_DESCRIPTION_1)
            titleItem1.text = it.getString(ARG_TITLE_1)
            infoItem1.text = it.getString(ARG_INFO_1)
            priceItem1.text = it.getString(ARG_PRICE_1)

            imageItem2.setImageResource(it.getInt(ARG_IMAGE_2))
            imageItem2.contentDescription = it.getString(ARG_IMAGE_DESCRIPTION_2)
            titleItem2.text = it.getString(ARG_TITLE_2)
            infoItem2.text = it.getString(ARG_INFO_2)
            priceItem2.text = it.getString(ARG_PRICE_2)

            imageItem3.setImageResource(it.getInt(ARG_IMAGE_3))
            imageItem3.contentDescription = it.getString(ARG_IMAGE_DESCRIPTION_3)
            titleItem3.text = it.getString(ARG_TITLE_3)
            infoItem3.text = it.getString(ARG_INFO_3)
            priceItem3.text = it.getString(ARG_PRICE_3)
        }
    }

    companion object {
        fun newInstance(image1: Int, imageDescription1: String, title1: String, info1: String, price1: String,
                        image2: Int, imageDescription2: String, title2: String, info2: String, price2: String,
                        image3: Int, imageDescription3: String, title3: String, info3: String, price3: String): StartersMenu {
            val fragment = StartersMenu()
            val args = Bundle()
            args.putInt(ARG_IMAGE_1, image1)
            args.putString(ARG_IMAGE_DESCRIPTION_1, imageDescription1)
            args.putString(ARG_TITLE_1, title1)
            args.putString(ARG_INFO_1, info1)
            args.putString(ARG_PRICE_1, price1)

            args.putInt(ARG_IMAGE_2, image2)
            args.putString(ARG_IMAGE_DESCRIPTION_2, imageDescription2)
            args.putString(ARG_TITLE_2, title2)
            args.putString(ARG_INFO_2, info2)
            args.putString(ARG_PRICE_2, price2)

            args.putInt(ARG_IMAGE_3, image3)
            args.putString(ARG_IMAGE_DESCRIPTION_3, imageDescription3)
            args.putString(ARG_TITLE_3, title3)
            args.putString(ARG_INFO_3, info3)
            args.putString(ARG_PRICE_3, price3)

            fragment.arguments = args
            return fragment
        }
    }
}