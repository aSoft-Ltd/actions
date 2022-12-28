package actions.internal

import koncurrent.Later
import actions.MutableAction1I1R
import koncurrent.Thenable

@PublishedApi
internal class MutableAction1I1RImpl<I, R>(
    override val name: String,
    override var handler: (I) -> Thenable<R>
) : MutableAction1I1R<I, R> {
    override fun onInvoked(h: (I) -> R) {
        handler = { Later.resolve(h(it)) }
    }

    override operator fun invoke(arg: I) = handler(arg)
    override fun hashCode() = name.hashCode()
    override fun toString() = "GenericPendingAction($name)"
    override fun equals(other: Any?) = other is MutableAction1I1R<*, *> && other.name == name
}