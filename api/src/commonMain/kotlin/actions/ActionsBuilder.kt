@file:JsExport

package actions

import kotlin.js.JsExport
import kotlin.js.JsName

@Suppress("NON_EXPORTABLE_TYPE")
abstract class ActionsBuilder<out A, in H> {
    abstract fun on(name: String, key: String = name.lowercase(), handler: H): A

    @JsName("_ignore_onAdd")
    fun onAdd(entity: String, handler: H) = on("Add $entity", handler = handler)

    fun onAdd(handler: H) = on("Add", handler = handler)

    fun onCreate(handler: H) = on("Create", handler = handler)

    fun onEdit(handler: H) = on("Edit", handler = handler)

    fun onUpdate(handler: H) = on("Update", handler = handler)

    fun onDuplicate(handler: H) = on("Duplicate", handler = handler)

    fun onAddAll(handler: H) = on("Add all", handler = handler)

    @JsName("onAddAllItems")
    fun onAddAll(col: Collection<Any?>, handler: H) = on(name = "Add (${col.size})", key = "add all", handler = handler)

    fun onView(handler: H) = on("View", handler = handler)

    fun onDelete(handler: H) = on("Delete", handler = handler)

    fun onDeleteAll(handler: H) = on("Delete all", handler = handler)

    @JsName("onDeleteAllItems")
    fun onDeleteAll(col: Collection<Any?>, handler: H) = on(name = "Delete (${col.size})", key = "delete all", handler = handler)

    fun onCancel(handler: H) = on("Cancel", handler = handler)

    fun onOk(handler: H) = on("Ok", handler = handler)

    fun onYes(handler: H) = on("Yes", handler = handler)

    fun onNo(handler: H) = on("No", handler = handler)

    fun onRetry(handler: H) = on("Retry", handler = handler)

    fun onGoBack(handler: H) = on("Go Back", handler = handler)
}