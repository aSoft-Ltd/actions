package actions

import kotlinx.collections.interoperable.mutableListOf

open class SimpleActionsBuilder : ActionsBuilder<SimpleAction, () -> Unit> {
    val actions = mutableListOf<SimpleAction>()
    override fun on(name: String, handler: () -> Unit): SimpleAction {
        val action = simpleAction(name, handler)
        actions.add(action)
        return action
    }
}