package com.example.ecommerce.domain

import com.example.ecommerce.domain.DomainEvent.ItemAddedToCartEvent
import com.example.ecommerce.domain.DomainEvent.ItemRemovedFromCartEvent
import java.util.*

class Cart {
    val cartId: String = UUID.randomUUID().toString()
    private val domainEvents: MutableList<DomainEvent> = mutableListOf()
    val cartItems: MutableList<CartItem> = mutableListOf()

    fun addProduct(cartItem: CartItem): Boolean {
        domainEvents.add(ItemAddedToCartEvent(cartItem.product.name, cartItem.quantity))
        return cartItems.add(cartItem)
    }

    fun removeProduct(cartItem: CartItem): Boolean {
        domainEvents.add(ItemRemovedFromCartEvent(cartItem.product.name, cartItem.quantity))
        return cartItems.remove(cartItem)
    }

    fun getDomainEvents() = domainEvents
}