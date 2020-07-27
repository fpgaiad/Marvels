package br.com.marvels.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import br.com.marvels.R
import kotlinx.android.synthetic.main.activity_marvels.*

class MarvelsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marvels)

        bottomNavigationView.setupWithNavController(marvelsNavHostFragment.findNavController())
    }
}