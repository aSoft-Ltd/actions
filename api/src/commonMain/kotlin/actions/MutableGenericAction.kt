@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE", "WRONG_EXPORTED_DECLARATION")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface MutableGenericAction<I, O> : GenericAction<I, O>, MutableAction<(I) -> Thenable<O>> {
    override var handler: (I) -> Thenable<O>

    fun onInvoked(h: (I) -> O)
}