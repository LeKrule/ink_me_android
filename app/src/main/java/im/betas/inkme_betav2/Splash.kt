package im.betas.inkme_betav2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import im.betas.inkme_betav2.R

class Splash : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splash_to_viewPager2)
        }, 3000)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }
}