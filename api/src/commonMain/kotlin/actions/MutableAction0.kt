@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION", "NON_EXPORTABLE_TYPE")

package actions

import kotlin.js.JsExport

interface MutableAction0<R> : Action0<R>, MutableAction<() -> R> {
    override var handler: () -> R

    fun onInvoked(h: () -> R)
}