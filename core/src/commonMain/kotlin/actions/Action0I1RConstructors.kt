package actions

import actions.internal.MutableAction0I1RImpl
import koncurrent.Later

inline fun <R> action0I1RLater(
    name: String,
    noinline handler: () -> Later<R>
): Action0I1R<R> = MutableAction0I1RImpl(name, handler)

inline fun <R> action0I1R(
    name: String,
    noinline handler: () -> R
): Action0I1R<R> = MutableAction0I1RImpl(name) {
    Later.resolve(Unit).then { handler() }
}

inline fun <R> mutableAction0I1RLater(
    name: String,
    noinline handler: () -> Later<R>
): MutableAction0I1R<R> = MutableAction0I1RImpl(name, handler)

inline fun <R> mutableAction0I1R(
    name: String,
    noinline handler: () -> R
): MutableAction0I1R<R> = MutableAction0I1RImpl(name) {
    Later.resolve(Unit).then { handler() }
}