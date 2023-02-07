@file:JsExport

package actions

import kotlin.js.JsExport

interface Action<out H> {
    val name: String
    val key: String
    val handler: H
}