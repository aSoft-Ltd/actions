package actions.internal

import actions.MutableAction1

@PublishedApi
internal class MutableAction1Impl<I, R>(
    override val name: String,
    override val key: String,
    override var handler: (I) -> R
) : MutableAction1<I, R> {
    override fun onInvoked(h: (I) -> R) {
        handler = h
    }

    override operator fun invoke(arg: I) = handler(arg)
    override fun hashCode() = name.hashCode()
    override fun toString() = "Action1($name)"
    override fun equals(other: Any?) = other is MutableAction1<out Any?, out Any?> && other.name == name
}