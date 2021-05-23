package com.thanakorn.spotifycloneapp2.di

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.thanakorn.spotifycloneapp2.R
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {
    fun  provideGlideInstance(context: Context) =
        Glide.with(context).setDefaultRequestOptions(
            RequestOptions()
                .placeholder(R.drawable.ic_image)
                .error(R.drawable.ic_image)
                .diskCacheStrategy(DiskCacheStrategy.DATA)
        )
    single { provideGlideInstance(androidContext()) }
}