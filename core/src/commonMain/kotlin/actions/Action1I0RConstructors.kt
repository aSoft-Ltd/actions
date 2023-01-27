@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package actions

import actions.internal.MutableAction1Impl
import koncurrent.Later
import kotlin.js.JsExport

inline fun <I> action1I0R(
    name: String,
    noinline handler: (I) -> Unit
): Action1<I, Unit> = MutableAction1Impl(name, handler)

inline fun <I> mutableAction1I0R(
    name: String,
    noinline handler: (I) -> Unit
): MutableAction1<I, Unit> = MutableAction1Impl(name, handler)