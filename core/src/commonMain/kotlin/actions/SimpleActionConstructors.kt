package actions

import actions.internal.MutableSimpleActionImpl
import koncurrent.Later

inline fun <O> simpleActionOfLater(
    name: String,
    noinline handler: () -> Later<O>
): SimpleAction<O> = MutableSimpleActionImpl(name, handler)

inline fun <O> simpleAction(
    name: String,
    noinline handler: () -> O
): SimpleAction<O> = MutableSimpleActionImpl(name) {
    Later.resolve(Unit).then { handler() }
}

inline fun <O> mutableSimpleActionOfLater(
    name: String,
    noinline handler: () -> Later<O>
): MutableSimpleAction<O> = MutableSimpleActionImpl(name, handler)

inline fun <O> mutableSimpleAction(
    name: String,
    noinline handler: () -> O
): MutableSimpleAction<O> = MutableSimpleActionImpl(name) {
    Later.resolve(Unit).then { handler() }
}