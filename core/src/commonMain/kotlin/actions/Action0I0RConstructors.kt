@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package actions

import actions.Action0
import actions.MutableAction0
import actions.internal.MutableAction0Impl
import koncurrent.Later
import kotlin.js.JsExport

inline fun action0I0R(
    name: String,
    noinline handler: () -> Unit
): Action0<Unit> = MutableAction0Impl(name) {
    Later(Unit).then { handler() }
}

inline fun mutableAction0I0R(
    name: String,
    noinline handler: () -> Unit
): MutableAction0<Unit> = MutableAction0Impl(name) {
    Later(Unit).then { handler() }
}