package actions

import kollections.iMutableListOf

open class Action0I0RBuilder : ActionsBuilder<Action0I1R<Unit>, () -> Unit> {
    val actions = iMutableListOf<Action0I1R<Unit>>()
    override fun on(name: String, handler: () -> Unit): Action0I1R<Unit> {
        val action = action0I0R(name, handler)
        actions.add(action)
        return action
    }
}