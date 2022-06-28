package com.ev.leroy_merlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ev.leroy_merlin.databinding.FragmentBrowsedBinding
import com.ev.leroy_merlin.databinding.FragmentCatalogBinding

class BrowsedFragment: Fragment() {

    private lateinit var binding: FragmentBrowsedBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBrowsedBinding.inflate(inflater, container, false)
        return binding.root
    }

}