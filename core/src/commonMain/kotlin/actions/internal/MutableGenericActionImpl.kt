package actions.internal

import koncurrent.Later
import actions.MutableGenericAction
import koncurrent.Thenable

@PublishedApi
internal class MutableGenericActionImpl<I, O>(
    override val name: String,
    override var handler: (I) -> Thenable<O>
) : MutableGenericAction<I, O> {
    override fun onInvoked(h: (I) -> O) {
        handler = { Later.resolve(h(it)) }
    }

    override operator fun invoke(arg: I) = handler(arg)
    override fun hashCode() = name.hashCode()
    override fun toString() = "GenericPendingAction($name)"
    override fun equals(other: Any?) = other is MutableGenericAction<*, *> && other.name == name
}