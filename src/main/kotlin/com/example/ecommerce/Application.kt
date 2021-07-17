package com.example.ecommerce

import com.example.ecommerce.domain.Cart
import com.example.ecommerce.domain.CartItem
import com.example.ecommerce.domain.Price
import com.example.ecommerce.domain.Product

fun main() {
    val cart = Cart()
    val newCart = Cart()
    val price = Price(100)

    val ipadProItem = CartItem(Product("Ipad Pro",price), 1)
    val heroInkPenItem = CartItem(Product("Hero ink Pen",price), 1)
    val gmCricketBatItem = CartItem(Product("GM Cricket bat",price), 2)

    cart.addProduct(ipadProItem)
    cart.addProduct(heroInkPenItem)
    cart.addProduct(gmCricketBatItem)

    newCart.addProduct(ipadProItem)

    cart.removeProduct(ipadProItem)

    println("Cart ${cart.cartId}")
    println("Cart ${newCart.cartId}")

    println("Items in cart ${cart.cartItems}")

    println("Removed items:  ${cart.getDomainEvents()}")
    println("Removed items:  ${newCart.getDomainEvents()}")
}
