@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION")

package actions

import kotlin.js.JsExport

interface MutableAction1<I, R> : Action1<I, R>, MutableAction<(I) -> R> {
    override var handler: (I) -> R

    fun onInvoked(h: (I) -> R)
}