package com.example.ecommerce.domain

class Cart {
    val cartItems: MutableList<CartItem> = mutableListOf()

    fun addProduct(cartItem: CartItem)  = cartItems.add(cartItem)

    fun removeProduct(cartItem: CartItem)  = cartItems.remove(cartItem)

}