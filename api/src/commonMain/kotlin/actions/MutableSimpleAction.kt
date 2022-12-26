@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION", "NON_EXPORTABLE_TYPE")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface MutableSimpleAction : SimpleAction, MutableAction<() -> Thenable<Any?>> {
    override var handler: () -> Thenable<Any?>

    fun onInvoked(h: () -> Unit)
}