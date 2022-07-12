package com.dmitry.aitu.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dmitry.aitu.R
import com.dmitry.aitu.domain.PlaylistModel
import com.dmitry.aitu.databinding.ItemPlaylistBinding

class PlaylistAdapter : RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder>() {

    var playlist = ArrayList<PlaylistModel>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class PlaylistViewHolder(val binding: ItemPlaylistBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val view = LayoutInflater.from(parent.context)
        val binding = ItemPlaylistBinding.inflate(view, parent, false)
        return PlaylistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        val playlist = playlist[position]
        with(holder.binding) {
            image.setImageResource(playlist.image)
            name.text = playlist.name
            countSong.text = playlist.numberSong
        }
    }

    override fun getItemCount(): Int {
        return playlist.size
    }

    fun addPlaylist(playlistModel: PlaylistModel) {
        playlist.add(playlistModel)
    }
}