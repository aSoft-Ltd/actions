@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package actions

import actions.internal.MutableAction0Impl
import koncurrent.Later
import kotlin.js.JsExport

inline fun <R> action0I1RLater(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> Later<R>
): Action0<Later<R>> = MutableAction0Impl(name, key, handler)

inline fun <R> action0I1R(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> R
): Action0<R> = MutableAction0Impl(name, key, handler)

inline fun <R> mutableAction0I1RLater(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> Later<R>
): MutableAction0<Later<R>> = MutableAction0Impl(name, key, handler)

inline fun <R> mutableAction0I1R(
    name: String,
    key: String = name.lowercase(),
    noinline handler: () -> R
): MutableAction0<R> = MutableAction0Impl(name, key, handler)