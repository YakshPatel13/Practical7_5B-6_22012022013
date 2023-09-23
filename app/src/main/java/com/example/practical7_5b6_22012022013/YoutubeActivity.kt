package com.example.practical7_5b6_22012022013

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import androidx.core.view.WindowCompat
import com.example.practical7_5b6_22012022013.databinding.ActivityYoutubeBinding


class YoutubeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityYoutubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        webviewert()
        binding.btn.setOnClickListener {
            Intent(this,MainActivity::class.java).also { startActivity(it) }
        }
    }
    private val ytid = "watch?v=ebfV2J4lso4"
    private fun webviewert(){
        val webSettings: WebSettings = binding.webview.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.webview.loadUrl("https://m.youtube.com/$ytid")
    }
}
