@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION", "NON_EXPORTABLE_TYPE")

package actions

import koncurrent.Later
import actions.internal.MutableSimpleActionImpl
import kotlin.js.JsExport
import kotlin.js.JsName
import kotlin.jvm.JvmName

interface MutableSimpleAction : SimpleAction, MutableAction<() -> Later<Any?>> {
    override var handler: () -> Later<Any?>

    fun onInvoked(h: () -> Unit)

    companion object {
        fun ofLater(
            name: String,
            handler: () -> Later<Any?>
        ): MutableSimpleAction = MutableSimpleActionImpl(name, handler)

        operator fun invoke(
            name: String,
            handler: () -> Unit
        ): MutableSimpleAction = MutableSimpleActionImpl(name) {
            Later.resolve(Unit).then { handler() }
        }
    }
}