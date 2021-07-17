package com.example.ecommerce.domain

import com.example.ecommerce.domain.DomainEvent.ItemAddedToCartEvent
import com.example.ecommerce.domain.DomainEvent.ItemRemovedFromCartEvent

class Cart {
    val cartItems: MutableList<CartItem> = mutableListOf()
    private val domainEvents: MutableList<DomainEvent> = mutableListOf()

    fun addProduct(cartItem: CartItem): Boolean {
        domainEvents.add(ItemAddedToCartEvent(cartItem.product, cartItem.quantity))
        return cartItems.add(cartItem)
    }

    fun removeProduct(cartItem: CartItem): Boolean {
        domainEvents.add(ItemRemovedFromCartEvent(cartItem.product, cartItem.quantity))
        return cartItems.remove(cartItem)
    }

    fun getDomainEvents() = domainEvents
}