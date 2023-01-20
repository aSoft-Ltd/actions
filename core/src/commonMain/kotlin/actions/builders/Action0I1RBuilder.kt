package actions.builders

import actions.Action0
import actions.ActionsBuilder
import actions.action0I1R

open class Action0I1RBuilder<R>(
    val actions: MutableList<Action0<R>> = mutableListOf()
) : ActionsBuilder<Action0<R>, () -> R>() {
    override fun on(name: String, handler: () -> R): Action0<R> {
        val action = action0I1R(name, handler)
        actions.add(action)
        return action
    }
}