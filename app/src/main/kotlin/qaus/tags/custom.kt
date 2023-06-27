package qaus.tags

import kotlinx.html.*
open class CARD(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*>)
    : HTMLTag("article", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowSectioningContent {
}

inline fun SectioningOrFlowContent.card(cardClasses: String? = null, noinline cardHeader: (HEADER.() -> Unit)? = null, noinline cardFooter: (FOOTER.() -> Unit)? = null, crossinline cardContent: SECTION.() -> Unit = {}) {
    CARD(attributesMapOf("class", "card " + cardClasses.orEmpty()), consumer).visit {
        if (cardHeader !== null){
            header {
                classes = setOf("card-header")
                cardHeader()
            }
        }
        section {
            cardContent()
        }
        if(cardFooter !== null) {
            footer {
                classes = mutableSetOf()
                cardFooter()
            }
        }
    }
}