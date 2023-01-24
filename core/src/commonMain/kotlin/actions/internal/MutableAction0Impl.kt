package actions.internal

import actions.MutableAction0
import koncurrent.Later
import koncurrent.Thenable

@PublishedApi
internal class MutableAction0Impl<R>(
    override val name: String,
    override var handler: () -> Thenable<R>
) : MutableAction0<R> {
    override fun onInvoked(h: () -> R) {
        handler = { Later(h()) }
    }

    override fun invoke() = handler()
    override fun hashCode() = name.hashCode()
    override fun toString() = "Action($name)"
    override fun equals(other: Any?) = other is MutableAction0<out Any?> && other.name == name
}