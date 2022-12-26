@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION", "NON_EXPORTABLE_TYPE")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface SimpleAction : Action<() -> Thenable<Any?>> {
    operator fun invoke(): Thenable<Any?>
}