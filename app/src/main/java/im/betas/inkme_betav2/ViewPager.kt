package im.betas.inkme_betav2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2

import androidx.appcompat.app.AppCompatActivity

import com.google.android.material.tabs.TabLayout


class ViewPager : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.viewpagerwrong, container, false)
        val fragmentLista = arrayListOf<Fragment>(
            tutorial_cliente_1(),
            tutorial_cliente_2(),
            tutorial_cliente_3()
        )
        val adapter = ViewPagerAdapter(
            fragmentLista,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = adapter

        return view
    }


}