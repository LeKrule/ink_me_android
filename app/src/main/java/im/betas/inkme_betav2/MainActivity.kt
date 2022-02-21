package im.betas.inkme_betav2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomnav)
         val navController = findNavController(R.id.fragment)

        bottomNavView.setupWithNavController(navController)
    }
    //Metodo para el boton siguiente

}