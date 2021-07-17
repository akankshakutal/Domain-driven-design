package com.example.ecommerce.domain.service

import com.example.ecommerce.domain.Cart

class CostService {

    fun calculateShippingCost(cart: Cart): Double {
        return if (cart.getCartItemWeight() < 100) {
            100.0
        } else {
            200.0
        }
    }
}