package com.example.ecommerce

import com.example.ecommerce.domain.Cart
import com.example.ecommerce.domain.CartItem
import com.example.ecommerce.domain.Price
import com.example.ecommerce.domain.Product


fun main() {
    val competitorProductPrices = mutableMapOf<String, Price>()
    val ipadPro = "Ipad Pro"
    val cricketBat = "GM Cricket bat"
    val heroInkPen = "Hero ink Pen"

    competitorProductPrices.put(ipadPro, Price(100.0))
//    competitorProductPrices.put(heroInkPen, Price(150.0))
    competitorProductPrices.put(cricketBat, Price(200.0))

    val cart = Cart()
    val newCart = Cart()

    val ipadProProduct = Product(ipadPro, price(competitorProductPrices, ipadPro, 100.0))
    val heroInkPenProduct = Product(heroInkPen, price(competitorProductPrices, heroInkPen, 50.0))
    val cricketBatProduct = Product(cricketBat, price(competitorProductPrices, cricketBat, 900.0))

    val ipadProItem = CartItem(ipadProProduct, 1)
    cart.addProduct(CartItem(ipadProProduct, 1))

    cart.addProduct(CartItem(heroInkPenProduct, 1))
    cart.addProduct(CartItem(cricketBatProduct, 2))

    newCart.addProduct(ipadProItem)

    cart.removeProduct(ipadProItem)

    printCart(cart, newCart)
}

private fun printCart(cart: Cart, newCart: Cart) {
    println("Cart ${cart.cartId}")
    println("Cart ${newCart.cartId}")

    println("Items in cart ${cart.cartItems}")

    println("Removed items:  ${cart.getDomainEvents()}")
    println("Removed items:  ${newCart.getDomainEvents()}")
}

private fun price(competitorProductPrices: MutableMap<String, Price>, productName: String, productPrice: Double): Price {
    val price = competitorProductPrices.get(productName)?.amount
    return if (price == null) Price(productPrice) else Price(price - (price * 0.1))
}
