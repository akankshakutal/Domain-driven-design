package com.example.ecommerce.domain

sealed class DomainEvent(open val product: Product, open val quantity: Int) {
    class ItemAddedToCartEvent(override val product: Product, override val quantity: Int) :
        DomainEvent(product, quantity)

    class ItemRemovedFromCartEvent(override val product: Product, override val quantity: Int) :
        DomainEvent(product, quantity)
}