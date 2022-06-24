package com.ev.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ev.activitylifecycle.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonToSecondActivity.setOnClickListener {
            startSecondActivity()
        }
    }

    private fun startSecondActivity() {
        val intent = Intent(this@FirstActivity, SecondActivity::class.java)
        startActivity(intent)
    }
}