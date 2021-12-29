package a.aut.aut

import a.aut.aut.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdmobs()

    }

    override fun onResume() {
        super.onResume()
        binding.adView.resume()
    }

    override fun onPause() {
        super.onPause()
        binding.adView.pause()

    }

    override fun onDestroy() {
        super.onDestroy()
        binding.adView.destroy()
    }

    private fun initAdmobs() {
        MobileAds.initialize(this)

        val adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)

    }
}
