package com.example.ecommerce.domain

import java.util.*

class Price(private val amount: Int, private val currency: Currency = Currency.getInstance("INR")) {
    override fun toString(): String  = "Price(amount=$amount, currency=$currency)"

}