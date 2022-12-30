@file:JsExport
package actions

import kotlin.js.JsExport

interface Action<out H> {
    val name: String
    val handler: H
}