package actions

import kollections.iMutableListOf

open class Action0I1RBuilder<R> : ActionsBuilder<Action0I1R<R>, () -> R> {
    val actions = iMutableListOf<Action0I1R<R>>()
    override fun on(name: String, handler: () -> R): Action0I1R<R> {
        val action = action0I1R(name, handler)
        actions.add(action)
        return action
    }
}