@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION", "NON_EXPORTABLE_TYPE")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface SimpleAction<out O> : Action<() -> Thenable<O>> {
    operator fun invoke(): Thenable<O>
}