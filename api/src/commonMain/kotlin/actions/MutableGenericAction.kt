@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE", "WRONG_EXPORTED_DECLARATION")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface MutableGenericAction<T> : GenericAction<T>, MutableAction<(T) -> Thenable<Any?>> {
    override var handler: (T) -> Thenable<Any?>

    fun onInvoked(h: (T) -> Unit)
}