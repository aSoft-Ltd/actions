@file:JsExport
@file:Suppress("NOTHING_TO_INLINE")

package actions

import kotlin.js.JsExport

abstract class ActionsBuilder<out A, in H> {
    abstract fun on(name: String, handler: H): A

    fun onAdd(handler: H) = on("Add", handler)

    fun onCreate(handler: H) = on("Create", handler)

    fun onEdit(handler: H) = on("Edit", handler)

    fun onDuplicate(handler: H) = on("Duplicate", handler)

    fun onAddAll(handler: H) = on("Add all", handler)

    fun onView(handler: H) = on("View", handler)

    fun onDelete(handler: H) = on("Delete", handler)

    fun onDeleteAll(handler: H) = on("Delete all", handler)

    fun onCancel(handler: H) = on("Cancel", handler)

    fun onOk(handler: H) = on("Ok", handler)

    fun onYes(handler: H) = on("Yes", handler)

    fun onNo(handler: H) = on("No", handler)

    fun onRetry(handler: H) = on("Retry", handler)

    fun onGoBack(handler: H) = on("Go Back", handler)
}