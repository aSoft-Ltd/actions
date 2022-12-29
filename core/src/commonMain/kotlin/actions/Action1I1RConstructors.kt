package actions

import actions.internal.MutableAction1I1RImpl
import koncurrent.Later

inline fun <I, R> action1I1RLater(
    name: String,
    noinline handler: (I) -> Later<R>
): Action1I1R<I, R> = MutableAction1I1RImpl(name, handler)

inline fun <I, R> action1I1R(
    name: String,
    noinline handler: (I) -> R
): Action1I1R<I, R> = MutableAction1I1RImpl(name) { param ->
    Later(Unit).then { handler(param) }
}

inline fun <I, R> mutableAction1I1RLater(
    name: String,
    noinline handler: (I) -> Later<R>
): MutableAction1I1R<I, R> = MutableAction1I1RImpl(name, handler)

inline fun <I, R> mutableAction1I1R(
    name: String,
    noinline handler: (I) -> R
): MutableAction1I1R<I, R> = MutableAction1I1RImpl(name) { param ->
    Later(Unit).then { handler(param) }
}