package com.acorn.testproject

import com.acorn.testproject.base.BaseActivity
import com.acorn.testproject.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun initListener() {
        super.initListener()
        binding.dialogHeightBtn.setOnClickListener {

        }
    }

    override fun createBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
}