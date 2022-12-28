@file:JsExport
@file:Suppress("WRONG_EXPORTED_DECLARATION", "NON_EXPORTABLE_TYPE")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface Action0I1R<out R> : Action<() -> Thenable<R>> {
    operator fun invoke(): Thenable<R>
}