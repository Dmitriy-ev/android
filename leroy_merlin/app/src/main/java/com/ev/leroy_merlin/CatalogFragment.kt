package com.ev.leroy_merlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ev.leroy_merlin.databinding.FragmentCatalogBinding

class CatalogFragment : Fragment() {

    private var _binding: FragmentCatalogBinding? = null
    private val binding: FragmentCatalogBinding
        get() = _binding ?: throw  RuntimeException("FragmentCatalogBinding == null")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentCatalogBinding.inflate(inflater, container, false)
        return binding.root
    }
}