/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package qaus

import kotlinx.html.*
import kotlinx.html.stream.appendHTML
import qaus.tags.*
//@HtmlTagMarker
//inline fun SectioningOrFlowContent.card(noinline cardHeader: (HEADER.() -> Unit)? = null, noinline cardFooter: (FOOTER.() -> Unit)? = null, crossinline content: SECTION.() -> Unit) {
//    article {
//        classes = setOf("card")
//        if (cardHeader != null) {
//            header {
//                classes = setOf("card-header")
//                cardHeader()
//            }
//        }
//        section {
//            classes = setOf("card-content")
//            content()
//        }
//        if (cardFooter != null) {
//            footer {
//                classes = setOf("card-footer")
//                cardFooter()
//            }
//        }
//    }
//}

fun Index(): String {
    return buildString {
        appendHTML().html {
            head {}
            body {
                card(cardHeader = {
                    classes += setOf("olv")
                    h1 { +"With Header!" }
                }) {
                    p { +"Hello Card!" }
                }
            }
        }
    }
}


fun main() {
    println(Index())
}
