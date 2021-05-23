package com.thanakorn.spotifycloneapp2.di

import android.content.Context
import com.google.android.exoplayer2.C
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.audio.AudioAttributes
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val serviceModule = module {

    fun provideAudioAttributes() = AudioAttributes.Builder()
        .setContentType(C.CONTENT_TYPE_MUSIC)
        .setUsage(C.USAGE_MEDIA)
        .build()

    fun provideExoPlayer(context: Context, audioAttributes: AudioAttributes) =
        SimpleExoPlayer.Builder(context).build().apply {
            setAudioAttributes(audioAttributes,true)
            setHandleAudioBecomingNoisy(true)
        }

    fun provideDataSourceFactory(
        context: Context
    )= DefaultDataSourceFactory(context,Util.getUserAgent(context,"Spotify App"))

        scope<AudioAttributes> {
           scoped { provideAudioAttributes() }
            scoped { provideExoPlayer(androidContext(),get())}
       }

}