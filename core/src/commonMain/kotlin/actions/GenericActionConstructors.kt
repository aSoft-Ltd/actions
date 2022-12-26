package actions

import actions.internal.MutableGenericActionImpl
import actions.internal.MutableSimpleActionImpl
import koncurrent.Later

inline fun <T> genericActionOfLater(
    name: String,
    noinline handler: (T) -> Later<Any?>
): GenericAction<T> = MutableGenericActionImpl(name, handler)

inline fun <T> genericAction(
    name: String,
    noinline handler: (T) -> Unit
): GenericAction<T> = MutableGenericActionImpl(name) { param ->
    Later.resolve(Unit).then { handler(param) }
}

inline fun <T> mutableGenericActionOfLater(
    name: String,
    noinline handler: (T) -> Later<Any?>
): MutableGenericAction<T> = MutableGenericActionImpl(name, handler)

inline fun <T> mutableGenericAction(
    name: String,
    noinline handler: (T) -> Unit
): MutableGenericAction<T> = MutableGenericActionImpl(name) { param ->
    Later.resolve(Unit).then { handler(param) }
}