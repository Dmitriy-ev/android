package com.ev.leroy_merlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ev.leroy_merlin.databinding.FragmentBrowsedBinding
import com.ev.leroy_merlin.databinding.FragmentRecommendedBinding

class RecommendedFragment: Fragment() {

    private lateinit var binding: FragmentRecommendedBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRecommendedBinding.inflate(inflater, container, false)
        return binding.root
    }
}