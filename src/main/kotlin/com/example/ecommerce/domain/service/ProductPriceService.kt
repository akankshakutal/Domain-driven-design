package com.example.ecommerce.domain.service

import com.example.ecommerce.domain.Price
import com.example.ecommerce.domain.ProductName

class ProductPriceService {

    private val competitorProductPrices = mapOf(
        ProductName.IPAD_PRO to Price(100.0),
        ProductName.CRICKET_BAT to Price(200.0)
    )

    fun getProducePrice(
        productName: ProductName,
        productPrice: Double
    ): Price {
        val price = competitorProductPrices.get(productName)?.amount
        return if (price == null) Price(productPrice) else Price(price - (price * 0.1))
    }
}

