@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION", "NON_EXPORTABLE_TYPE")

package actions

import actions.internal.MutableSimpleActionImpl
import koncurrent.Later
import kotlin.js.JsExport

interface SimpleAction : Action<() -> Later<Any?>> {
    operator fun invoke(): Later<Any?>

    companion object {
        fun ofLater(
            name: String,
            handler: () -> Later<Any?>
        ): SimpleAction = MutableSimpleActionImpl(name, handler)

        operator fun invoke(
            name: String,
            handler: () -> Unit
        ): SimpleAction = MutableSimpleActionImpl(name) {
            Later.resolve(Unit).then { handler() }
        }
    }
}