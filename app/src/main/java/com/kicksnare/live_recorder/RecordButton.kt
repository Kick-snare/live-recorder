package com.kicksnare.live_recorder

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageButton
import androidx.appcompat.widget.AppCompatImageButton
import java.util.jar.Attributes

class RecordButton(
    context: Context,
    attrs: AttributeSet
): AppCompatImageButton(context, attrs) {

    fun updateIconWithState(state: State) {
        when(state) {
            State.BEFORE_RECORDING -> { setImageResource(R.drawable.ic_record) }
            State.AFTER_RECORDING ->  { setImageResource(R.drawable.ic_play) }
            State.ON_PLAYING,
            State.ON_RECORDING -> { setImageResource(R.drawable.ic_stop) }
        }
    }
}