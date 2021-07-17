package com.example.ecommerce.domain.service

import com.example.ecommerce.domain.Price

class ProductPriceService {

    val ipadPro = "Ipad Pro"
    val cricketBat = "GM Cricket bat"

    private val competitorProductPrices = mapOf(
        ipadPro to Price(100.0),
        cricketBat to Price(100.0)
    )

    public fun getProducePrice(
        productName: String,
        productPrice: Double
    ): Price {
        val price = competitorProductPrices.get(productName)?.amount
        return if (price == null) Price(productPrice) else Price(price - (price * 0.1))
    }
}

