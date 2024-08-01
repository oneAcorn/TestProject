package com.acorn.testproject.base

import android.app.Activity
import android.os.Bundle
import androidx.viewbinding.ViewBinding

/**
 * Created by acorn on 2024/8/1.
 */
abstract class BaseActivity<T : ViewBinding> : Activity() {
    protected lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = createBinding()
        setContentView(binding.root)
        init()
    }

    private fun init() {
        initParameters()
        initView()
        initListener()
        initData()
    }

    abstract fun createBinding(): T

    open fun initParameters() {}

    open fun initView() {}

    open fun initData() {}

    open fun initListener() {}
}