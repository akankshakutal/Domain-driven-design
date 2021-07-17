package com.example.ecommerce.domain

import java.util.*

class Price(val amount: Double, private val currency: Currency = Currency.getInstance("INR")) {
    override fun toString(): String  = "Price(amount=$amount, currency=$currency)"

}