@file:JsExport

package actions

import kotlin.js.JsExport

interface MutableAction<H> : Action<H> {
    override var handler: H
}