@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE", "WRONG_EXPORTED_DECLARATION")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface MutableAction1<I, R> : Action1<I, R>, MutableAction<(I) -> Thenable<R>> {
    override var handler: (I) -> Thenable<R>

    fun onInvoked(h: (I) -> R)
}