@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE", "WRONG_EXPORTED_DECLARATION")

package actions

import koncurrent.Thenable
import kotlin.js.JsExport

interface Action1<in I, out R> : Action<(I) -> Thenable<R>> {
    operator fun invoke(arg: I): Thenable<R>
}