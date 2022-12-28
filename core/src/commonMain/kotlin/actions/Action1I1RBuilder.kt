package actions

import kollections.iMutableListOf

open class Action1I1RBuilder<I, O> : ActionsBuilder<Action1I1R<I, O>, (I) -> O> {
    val actions = iMutableListOf<Action1I1R<I, O>>()
    override fun on(name: String, handler: (I) -> O): Action1I1R<I, O> {
        val action = action1I1R(name, handler)
        actions.add(action)
        return action
    }
}