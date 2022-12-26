@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE", "WRONG_EXPORTED_DECLARATION")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface GenericAction<in T> : Action<(T) -> Thenable<Any?>> {
    operator fun invoke(arg: T): Thenable<Any?>
}