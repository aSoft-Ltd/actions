package actions.internal

import koncurrent.Later
import actions.MutableAction1
import koncurrent.Thenable

@PublishedApi
internal class MutableAction1Impl<I, R>(
    override val name: String,
    override var handler: (I) -> Thenable<R>
) : MutableAction1<I, R> {
    override fun onInvoked(h: (I) -> R) {
        handler = { Later(h(it)) }
    }

    override operator fun invoke(arg: I) = handler(arg)
    override fun hashCode() = name.hashCode()
    override fun toString() = "GenericPendingAction($name)"
    override fun equals(other: Any?) = other is MutableAction1<*, *> && other.name == name
}