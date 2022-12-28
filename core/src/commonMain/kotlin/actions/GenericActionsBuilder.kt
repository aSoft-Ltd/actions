package actions

import kollections.iMutableListOf

open class GenericActionsBuilder<I, O> : ActionsBuilder<GenericAction<I, O>, (I) -> O> {
    val actions = iMutableListOf<GenericAction<I, O>>()
    override fun on(name: String, handler: (I) -> O): GenericAction<I, O> {
        val action = genericAction(name, handler)
        actions.add(action)
        return action
    }
}