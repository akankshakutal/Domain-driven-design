package com.example.ecommerce.domain.service

import com.example.ecommerce.domain.Cart

class OrderService {

    fun placeOrder(cart: Cart) {
        val cartItems = cart.cartItems
        println("cart Items to Order are: $cartItems")
        cart.markCartAsChecked()
    }

    fun getTotalCost(cart: Cart): Double {
        val shippingCost = CostService().calculateShippingCost(cart)
        return shippingCost + cart.getTotalCost()
    }
}