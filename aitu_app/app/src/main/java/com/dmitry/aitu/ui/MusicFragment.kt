package com.dmitry.aitu.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.dmitry.aitu.R
import com.dmitry.aitu.ui.adapter.PlaylistAdapter
import com.dmitry.aitu.databinding.FragmentMusicBinding
import com.dmitry.aitu.domain.PlaylistModel

class MusicFragment : Fragment() {

    private lateinit var binding: FragmentMusicBinding
    private var playlistAdapter = PlaylistAdapter()

    private var index = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentMusicBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.apply {
            recyclerView.layoutManager = GridLayoutManager(activity, 2)
            recyclerView.adapter = playlistAdapter
            for (i in 0..10) {
                val playlist = PlaylistModel(index, R.drawable.move3, "плейлист", "10 треков")
                playlistAdapter.addPlaylist(playlist)
                index++
            }
        }
    }

    companion object {

        fun newInstance(): MusicFragment {
            return MusicFragment()
        }
    }
}