package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.project.databinding.ActivityWebviewBinding
import kotlinx.android.synthetic.main.activity_webview.*

class webview : AppCompatActivity() {
    private lateinit var binding: ActivityWebviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebviewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val url="https://experience.ngage.ai/join-event/41577"
        binding.webPoll.settings.javaScriptEnabled=true
        binding.webPoll.settings.userAgentString="Mozilla/5.0 (iPhone; U; CPU like Mac OS X; en) AppleWebKit/420+ (KHTML, like Gecko) Version/3.0 Mobile/1A543a Safari/419.3"
        binding.webPoll.webViewClient=object :WebViewClient()
        {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                //progressBar.visibility=View.GONE
                binding.progressBar.visibility=View.GONE
                //web_poll.visibility=View.VISIBLE
                binding.webPoll.visibility=View.VISIBLE
            }
        }
        //web_poll.loadUrl(url)
        binding.webPoll.loadUrl(url)
    }
}