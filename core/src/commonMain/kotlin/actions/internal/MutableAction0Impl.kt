package actions.internal

import actions.MutableAction0

@PublishedApi
internal class MutableAction0Impl<R>(
    override val name: String,
    override val key: String,
    override var handler: () -> R
) : MutableAction0<R> {
    override fun onInvoked(h: () -> R) {
        handler = h
    }

    override fun invoke() = handler()
    override fun hashCode() = name.hashCode()
    override fun toString() = "Action2($name)"
    override fun equals(other: Any?) = other is MutableAction0<out Any?> && other.name == name
}