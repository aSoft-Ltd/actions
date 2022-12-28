package actions

import actions.internal.MutableAction0I1RImpl
import koncurrent.Later

inline fun action0I0RLater(
    name: String,
    noinline handler: () -> Later<Unit>
): Action0I1R<Unit> = MutableAction0I1RImpl(name, handler)

inline fun action0I0R(
    name: String,
    noinline handler: () -> Unit
): Action0I1R<Unit> = MutableAction0I1RImpl(name) {
    Later.resolve(Unit).then { handler() }
}

inline fun mutableAction0I0RLater(
    name: String,
    noinline handler: () -> Later<Unit>
): MutableAction0I1R<Unit> = MutableAction0I1RImpl(name, handler)

inline fun mutableAction0I0R(
    name: String,
    noinline handler: () -> Unit
): MutableAction0I1R<Unit> = MutableAction0I1RImpl(name) {
    Later.resolve(Unit).then { handler() }
}