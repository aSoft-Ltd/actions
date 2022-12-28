@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION", "NON_EXPORTABLE_TYPE")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface MutableSimpleAction<O> : SimpleAction<O>, MutableAction<() -> Thenable<O>> {
    override var handler: () -> Thenable<O>

    fun onInvoked(h: () -> O)
}