package com.example.ecommerce.domain

sealed class DomainEvent(open val product: String, open val quantity: Int) {
    class ItemAddedToCartEvent(override val product: String, override val quantity: Int) :
        DomainEvent(product, quantity)

    class ItemRemovedFromCartEvent(override val product: String, override val quantity: Int) :
        DomainEvent(product, quantity)
}