package im.betas.inkme_betav2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(list: ArrayList<Fragment> ,
                       fm: FragmentManager,
                       lifecycle: Lifecycle )
    : FragmentStateAdapter(fm,lifecycle) {

    private val fragmetnList : ArrayList<Fragment> = list
    override fun getItemCount(): Int {
       return fragmetnList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmetnList[position]
    }

}