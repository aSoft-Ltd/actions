package actions.builders

import actions.Action1
import actions.ActionsBuilder
import actions.constructors.action1I1R
import kollections.iMutableListOf

open class Action1I1RBuilder<I, O> : ActionsBuilder<Action1<I, O>, (I) -> O> {
    val actions = iMutableListOf<Action1<I, O>>()
    override fun on(name: String, handler: (I) -> O): Action1<I, O> {
        val action = action1I1R(name, handler)
        actions.add(action)
        return action
    }
}