package com.example.cash_manager_front

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> ListArticleFragment()
            1 -> CartFragment()
            else -> return PayModeFragment()

        }

    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Articles"
            1 -> "Cart"
            else -> {
                return "Payement"
            }
        }
    }
}

