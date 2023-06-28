package qaus.tags

import kotlinx.html.*

open class CARD(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*>)
    : HTMLTag("article", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowSectioningContent {}

open class CARDHEADER(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*>)
    : HTMLTag("header", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowSectioningContent {}

open class CARDFOOTER(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*>)
    : HTMLTag("footer", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowSectioningContent {}

inline fun CARD.cardHeader(headerClasses: String? = null, crossinline block: CARDHEADER.() -> Unit) {
    CARDHEADER(attributesMapOf("class", "card-header ${headerClasses.orEmpty()}"), consumer).visit(block)
}

inline fun CARD.cardFooter(footerClasses: String? = null, crossinline block: CARDFOOTER.() -> Unit) {
    CARDFOOTER(attributesMapOf("class", "card-footer ${footerClasses.orEmpty()}"), consumer).visit(block)
}

inline fun SectioningOrFlowContent.card(cardClasses: String? = null, crossinline cardContent: CARD.() -> Unit = {}) {
    CARD(attributesMapOf("class", "card ${cardClasses.orEmpty()}"), consumer).visit(cardContent)
}