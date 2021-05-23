package com.thanakorn.spotifycloneapp2.exoplayer

class FirebaseMusicSource {


    private val onReadyListeners = mutableListOf<(Boolean) -> Unit>()

    private var state: State = State.STATE_CREATED
        set(value){
            if (value == State.STATE_INITIALIZED || value == State.STATE_ERROR){
                synchronized(onReadyListeners){
                    field = value
                    onReadyListeners.forEach{listener ->
                        listener(state == State.STATE_INITIALIZED)
                    }
                }

            }else{
                field =value
            }

        }

    fun whenReady(action: (Boolean) -> Unit) : Boolean{
        if (state == State.STATE_CREATED || state == State.STATE_INITIALING){
            onReadyListeners += action
            return false
        } else {
            action(state == State.STATE_INITIALIZED)
        }
    }



}


enum class State {
    STATE_CREATED,
    STATE_INITIALIZED,
    STATE_INITIALING,
    STATE_ERROR
}