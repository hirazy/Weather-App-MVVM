package com.example.weather_app_mvvp.base.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProviders
import com.example.weather_app_mvvp.base.utils.LayoutId
import com.example.weather_app_mvvp.base.widget.DialogLoading

abstract class BaseActivity<ViewBiding : ViewDataBinding, viewModel : BaseViewModel> :
    AppCompatActivity() {
    lateinit var ViewBiding: ViewBiding
    lateinit var viewModel: viewModel
    protected val TAG = BaseActivity::class.java.simpleName
    lateinit var loading: DialogLoading
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewBiding =
            DataBindingUtil.setContentView(
                this,
                javaClass.getAnnotation(LayoutId::class.java).value
            )
        loading = DialogLoading(this)

        ViewBiding.lifecycleOwner = this

        viewModel = ViewModelProviders.of(this).get(getViewModel())
        viewModel.setLifecycleOwener(this)
        viewModel.context = this
        viewModel.activity = this
        viewModel.loading.observe(this) {
            if (it) {
                loading.showLoading()
                Log.e(TAG, "Loading HIEN THI")
            } else {
                loading.dismissLoading()
                Log.e(TAG, "Loading AN")
            }
        }
        viewModel.err.observe(this) {
            Log.e(TAG, " HIEN THI LOI" + it.toString())
        }

        initView()
        initObserve()

    }

    abstract fun initObserve()

    abstract fun initView()

    abstract fun getViewModel(): Class<viewModel>

}