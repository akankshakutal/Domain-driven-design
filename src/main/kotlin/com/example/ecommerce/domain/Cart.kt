package com.example.ecommerce.domain

import com.example.ecommerce.domain.DomainEvent.ItemAddedToCartEvent
import com.example.ecommerce.domain.DomainEvent.ItemRemovedFromCartEvent
import java.util.*

class Cart {
    val cartId: String = UUID.randomUUID().toString()
    private var checked: Boolean = false
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

    fun getTotalCost(): Double {
        var totalAmount = 0.0
        cartItems.forEach { totalAmount += (it.product.price.amount * it.quantity) }
        return totalAmount
    }

    fun getCartItemWeight(): Double {
        var weight = 0.0
        cartItems.forEach { weight = weight + it.product.weight }
        return weight
    }

    fun markCartAsChecked() {
        this.checked = true
    }

    fun getDomainEvents() = domainEvents
}