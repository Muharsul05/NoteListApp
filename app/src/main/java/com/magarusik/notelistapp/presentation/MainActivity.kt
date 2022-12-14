package com.magarusik.notelistapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.magarusik.notelistapp.R

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this) {
            Log.d("MainActivityTest", it.toString())
            if (count == 0) {
                viewModel.changeEnableState(it[0])
                viewModel.deleteShopItem(it[2])
                ++count
            }
        }
    }
}