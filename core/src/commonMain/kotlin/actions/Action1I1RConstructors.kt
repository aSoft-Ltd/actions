@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package actions

import actions.internal.MutableAction1Impl
import koncurrent.Later
import kotlin.js.JsExport

inline fun <I, R> action1I1RLater(
    name: String,
    noinline handler: (I) -> Later<R>
): Action1<I, R> = MutableAction1Impl(name, handler)

inline fun <I, R> action1I1R(
    name: String,
    noinline handler: (I) -> R
): Action1<I, R> = MutableAction1Impl(name) { param ->
    Later(Unit).then { handler(param) }
}

inline fun <I, R> mutableAction1I1RLater(
    name: String,
    noinline handler: (I) -> Later<R>
): MutableAction1<I, R> = MutableAction1Impl(name, handler)

inline fun <I, R> mutableAction1I1R(
    name: String,
    noinline handler: (I) -> R
): MutableAction1<I, R> = MutableAction1Impl(name) { param ->
    Later(Unit).then { handler(param) }
}