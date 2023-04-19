package com.example.warehousemanagerapp.Activirty.Fragment_Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.warehousemanagerapp.databinding.GoodsFragmentBinding

class Goods : Fragment() {

    private lateinit var goodsbinding : GoodsFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        goodsbinding = GoodsFragmentBinding.inflate(layoutInflater)
        return goodsbinding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}