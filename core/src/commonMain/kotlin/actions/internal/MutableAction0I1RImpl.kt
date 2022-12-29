package actions.internal

import actions.MutableAction0I1R
import koncurrent.Later
import koncurrent.Thenable

@PublishedApi
internal class MutableAction0I1RImpl<R>(
    override val name: String,
    override var handler: () -> Thenable<R>
) : MutableAction0I1R<R> {
    override fun onInvoked(h: () -> R) {
        handler = { Later(h()) }
    }

    override fun invoke() = handler()
    override fun hashCode() = name.hashCode()
    override fun toString() = "Action($name)"
    override fun equals(other: Any?) = other is MutableAction0I1R<*> && other.name == name
}