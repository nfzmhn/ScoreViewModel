// MainActivity.kt
package pam.lat.scoreviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import pam.lat.scoreviewmodel.R
import pam.lat.scoreviewmodel.databinding.ActivityMainBinding
import pam.lat.scoreviewmodel.ScoreViewModel

class  MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: ScoreViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menggunakan Data Binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Mengaitkan ViewModel dengan layout
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
