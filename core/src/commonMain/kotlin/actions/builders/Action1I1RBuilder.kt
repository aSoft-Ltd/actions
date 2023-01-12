package actions.builders

import actions.Action1
import actions.ActionsBuilder
import actions.action1I1R

open class Action1I1RBuilder<I, O> : ActionsBuilder<Action1<I, O>, (I) -> O> {
    val actions = mutableListOf<Action1<I, O>>()
    override fun on(name: String, handler: (I) -> O): Action1<I, O> {
        val action = action1I1R(name, handler)
        actions.add(action)
        return action
    }
}