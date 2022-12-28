@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE", "WRONG_EXPORTED_DECLARATION")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface GenericAction<in I, out O> : Action<(I) -> Thenable<O>> {
    operator fun invoke(arg: I): Thenable<O>
}