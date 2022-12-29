package actions

import actions.internal.MutableAction0I1RImpl
import koncurrent.Later

inline fun action0I0R(
    name: String,
    noinline handler: () -> Unit
): Action0I1R<Unit> = MutableAction0I1RImpl(name) {
    Later(Unit).then { handler() }
}

inline fun <R> action0I1RLater(
    name: String,
    noinline handler: () -> Later<R>
): Action0I1R<R> = MutableAction0I1RImpl(name, handler)

inline fun <R> action0I1R(
    name: String,
    noinline handler: () -> R
): Action0I1R<R> = MutableAction0I1RImpl(name) {
    Later(Unit).then { handler() }
}

inline fun <R> mutableAction0I1RLater(
    name: String,
    noinline handler: () -> Later<R>
): MutableAction0I1R<R> = MutableAction0I1RImpl(name, handler)

inline fun <R> mutableAction0I1R(
    name: String,
    noinline handler: () -> R
): MutableAction0I1R<R> = MutableAction0I1RImpl(name) {
    Later(Unit).then { handler() }
}

inline fun mutableAction0I0R(
    name: String,
    noinline handler: () -> Unit
): MutableAction0I1R<Unit> = MutableAction0I1RImpl(name) {
    Later(Unit).then { handler() }
}