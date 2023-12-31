/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package qaus

import kotlinx.html.*
import kotlinx.html.stream.appendHTML
import qaus.tags.*

fun FlowContent.aCardHeader(cardHeaderClasses: String?, block: HEADER.() -> Unit) {
    header {
        classes = setOf(cardHeaderClasses.orEmpty())
        block()
    }
}

fun Index(): String {
    return buildString {
        appendHTML().html {
            head {}
            body {
                header {
                    h1 { +"This is a test!" }
                }
                card {
                    cardHeader {
                        h1 { +"Hello World!" }
                    }
                    p { +"Hello Card!" }
                }
                card {
                    cardHeader {
                        h1 { +"Hello World!" }
                    }
                    p { +"Hello Card!" }
                    cardFooter {
                        p { +"This is part of the footer!" }
                        ul {
                            li { +"This is an item!" }
                            li { +"This too!" }
                        }
                    }
                }
            }
        }
    }
}


fun main() {
    println(Index())
}
