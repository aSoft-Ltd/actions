@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION", "NON_EXPORTABLE_TYPE")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface MutableAction0<R> : Action0<R>, MutableAction<() -> Thenable<R>> {
    override var handler: () -> Thenable<R>

    fun onInvoked(h: () -> R)
}