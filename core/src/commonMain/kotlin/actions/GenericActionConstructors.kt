package actions

import actions.internal.MutableGenericActionImpl
import actions.internal.MutableSimpleActionImpl
import koncurrent.Later

inline fun <I, O> genericActionOfLater(
    name: String,
    noinline handler: (I) -> Later<O>
): GenericAction<I, O> = MutableGenericActionImpl(name, handler)

inline fun <I, O> genericAction(
    name: String,
    noinline handler: (I) -> O
): GenericAction<I, O> = MutableGenericActionImpl(name) { param ->
    Later.resolve(Unit).then { handler(param) }
}

inline fun <I, O> mutableGenericActionOfLater(
    name: String,
    noinline handler: (I) -> Later<O>
): MutableGenericAction<I, O> = MutableGenericActionImpl(name, handler)

inline fun <I, O> mutableGenericAction(
    name: String,
    noinline handler: (I) -> O
): MutableGenericAction<I, O> = MutableGenericActionImpl(name) { param ->
    Later.resolve(Unit).then { handler(param) }
}