package ink.momingmominguidemo.adapter


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ink.momingmominguidemo.fragment.ItemAFragment
import ink.momingmominguidemo.fragment.ItemBFragment

class TabViewPagerAdapter(fm:FragmentManager,behavior:Int):FragmentPagerAdapter(fm,behavior) {


    var fragments= listOf<Fragment>(ItemAFragment.newInstance(),ItemBFragment.newInstance())


    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int):Fragment{
        return fragments.get(position)
    }


}