package qaus.tags

import kotlinx.html.*

open class CARDHEADER(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*>)
    : HTMLTag("article", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowSectioningContent {
}


open class CARD(initialAttributes: Map<String, String>, override val consumer: TagConsumer<*>)
    : HTMLTag("article", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowSectioningContent {
    private var _header: CARDHEADER? = null
    var cardHeader: CARDHEADER?
        get() = _header
        set(header) {
            this._header = header
        }
}

val CARD.asFlowContent: FlowContent
    get() = this
val CARD.asSectioningContent: SectioningContent
    get() = this