package actions.internal

import koncurrent.Later
import actions.MutableGenericAction
import koncurrent.Thenable

@PublishedApi
internal class MutableGenericActionImpl<T>(
    override val name: String,
    override var handler: (T) -> Thenable<Any?>
) : MutableGenericAction<T> {
    override fun onInvoked(h: (T) -> Unit) {
        handler = { Later.resolve(h(it)) }
    }

    override operator fun invoke(arg: T) = handler(arg)
    override fun hashCode() = name.hashCode()
    override fun toString() = "GenericPendingAction($name)"
    override fun equals(other: Any?) = other is MutableGenericAction<*> && other.name == name
}