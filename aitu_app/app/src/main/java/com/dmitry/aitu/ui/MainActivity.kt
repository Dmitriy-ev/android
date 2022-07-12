package com.dmitry.aitu.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.dmitry.aitu.R
import com.dmitry.aitu.databinding.ActivityMainBinding
import com.dmitry.aitu.domain.PlaylistModel
import com.dmitry.aitu.ui.adapter.PlaylistAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        launchMusicFragment()
    }

    private fun launchMusicFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, MusicFragment.newInstance())
            .commit()
    }
}