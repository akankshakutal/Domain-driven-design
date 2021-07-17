package com.example.ecommerce.domain

class CartItem(val product: Product, val quantity: Int) {
    override fun toString() = "CartItem(product=$product, quantity=$quantity)"
}