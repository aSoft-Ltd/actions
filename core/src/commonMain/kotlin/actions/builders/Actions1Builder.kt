package actions.builders

import actions.Action1
import actions.ActionsBuilder
import actions.action1I1R

open class Actions1Builder<I, O>(
    val actions: MutableList<Action1<I, O>> = mutableListOf()
) : ActionsBuilder<Action1<I, O>, (I) -> O>() {
    override fun on(name: String, handler: (I) -> O): Action1<I, O> {
        val action = action1I1R(name, handler)
        actions.add(action)
        return action
    }
}