package com.example.warehousemanagerapp.Activirty

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.warehousemanagerapp.R
import com.example.warehousemanagerapp.databinding.LayoutHomeBinding

class Home : AppCompatActivity(){
    private lateinit var homebin : LayoutHomeBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState);
        homebin = LayoutHomeBinding.inflate(layoutInflater)
        val view  =  homebin.root
        setContentView(view);



    }

}