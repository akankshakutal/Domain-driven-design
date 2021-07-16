package com.example.ecommerce

import com.example.ecommerce.domain.Cart
import com.example.ecommerce.domain.CartItem
import com.example.ecommerce.domain.Product

fun main() {
    println("Starting")

    val cart = Cart()
    val removedItem = mutableListOf<CartItem>()

    val ipadProItem = CartItem(Product("Ipad Pro"), 1)
    val heroInkPenItem = CartItem(Product("Hero ink Pen"), 1)
    val gmCricketBatItem = CartItem(Product("GM Cricket bat"), 2)

    addProductToCart(ipadProItem, cart)
    addProductToCart(heroInkPenItem, cart)
    addProductToCart(gmCricketBatItem, cart)

    cart.removeProduct(ipadProItem)
    removedItem.add(ipadProItem)
    println("Items in cart ${cart.cartItems}")
    removedItem.forEach { it -> println("Removed item: ${it.product}") }
}


private fun addProductToCart(cartItem: CartItem, cart: Cart) = cart.addProduct(cartItem)

