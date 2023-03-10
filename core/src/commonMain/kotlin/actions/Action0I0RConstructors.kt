@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package actions

import actions.internal.MutableAction0Impl
import koncurrent.Later
import kotlin.js.JsExport

inline fun action0I0R(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> Unit
): Action0<Unit> = MutableAction0Impl(name, key, handler)

inline fun mutableAction0I0R(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> Unit
): MutableAction0<Unit> = MutableAction0Impl(name, key, handler)

inline fun mutableAction0I0RLater(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> Later<Unit>
): MutableAction0<Later<Unit>> = MutableAction0Impl(name, key, handler)