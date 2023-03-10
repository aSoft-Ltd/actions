@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package actions

import actions.internal.MutableAction1Impl
import koncurrent.Later
import kotlin.js.JsExport

inline fun <I, R> action1I1RLater(
    name: String,
    key: String = name.lowercase(),
    noinline handler: (I) -> Later<R>
): Action1<I, Later<R>> = MutableAction1Impl(name, key, handler)

inline fun <I, R> action1I1R(
    name: String,
    key: String = name.lowercase(),
    noinline handler: (I) -> R
): Action1<I, R> = MutableAction1Impl(name, key, handler)

inline fun <I, R> mutableAction1I1RLater(
    name: String,
    key: String = name.lowercase(),
    noinline handler: (I) -> Later<R>
): MutableAction1<I, Later<R>> = MutableAction1Impl(name, key, handler)

inline fun <I, R> mutableAction1I1R(
    name: String,
    key: String = name.lowercase(),
    noinline handler: (I) -> R
): MutableAction1<I, R> = MutableAction1Impl(name, key, handler)