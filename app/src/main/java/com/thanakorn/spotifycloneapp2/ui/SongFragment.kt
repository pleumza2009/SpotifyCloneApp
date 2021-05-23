package com.thanakorn.spotifycloneapp2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thanakorn.spotifycloneapp2.R
import com.thanakorn.spotifycloneapp2.databinding.FragmentSongBinding


class SongFragment : Fragment(R.layout.fragment_song) {

    private lateinit var  binding: FragmentSongBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSongBinding.bind(view)
    }

}