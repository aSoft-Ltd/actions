package actions

import kollections.iMutableListOf

open class SimpleActionsBuilder<O> : ActionsBuilder<SimpleAction<O>, () -> O> {
    val actions = iMutableListOf<SimpleAction<O>>()
    override fun on(name: String, handler: () -> O): SimpleAction<O> {
        val action = simpleAction(name, handler)
        actions.add(action)
        return action
    }
}