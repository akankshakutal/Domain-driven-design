package com.example.ecommerce

import com.example.ecommerce.domain.Cart
import com.example.ecommerce.domain.CartItem
import com.example.ecommerce.domain.Price
import com.example.ecommerce.domain.Product
import com.example.ecommerce.domain.service.ProductPriceService


fun main() {
    val ipadPro = "Ipad Pro"
    val cricketBat = "GM Cricket bat"
    val heroInkPen = "Hero ink Pen"

    val cart = Cart()
    val newCart = Cart()
    val productPriceService = ProductPriceService()

    val ipadProProduct = Product(ipadPro, productPriceService.getProducePrice(ipadPro, 100.0))
    val heroInkPenProduct = Product(heroInkPen, productPriceService.getProducePrice(heroInkPen, 50.0))
    val cricketBatProduct = Product(cricketBat, productPriceService.getProducePrice(cricketBat, 900.0))

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