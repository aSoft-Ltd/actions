package actions

import actions.internal.MutableSimpleActionImpl
import koncurrent.Later

inline fun simpleActionOfLater(
    name: String,
    noinline handler: () -> Later<Any?>
): SimpleAction = MutableSimpleActionImpl(name, handler)

inline fun simpleAction(
    name: String,
    noinline handler: () -> Unit
): SimpleAction = MutableSimpleActionImpl(name) {
    Later.resolve(Unit).then { handler() }
}

inline fun mutableSimpleActionOfLater(
    name: String,
    noinline handler: () -> Later<Any?>
): MutableSimpleAction = MutableSimpleActionImpl(name, handler)

inline fun mutableSimpleAction(
    name: String,
    noinline handler: () -> Unit
): MutableSimpleAction = MutableSimpleActionImpl(name) {
    Later.resolve(Unit).then { handler() }
}