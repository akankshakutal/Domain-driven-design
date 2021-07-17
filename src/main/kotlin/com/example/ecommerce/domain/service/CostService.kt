package com.example.ecommerce.domain.service

import com.example.ecommerce.domain.Cart

class CostService {

    fun calculateShippingCost(cart: Cart): Double {
        if (cart.getCartItemWeight() < 100) {
            return 100.0
        } else {
            return 200.0
        }
    }
}