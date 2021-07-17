package com.example.ecommerce

import com.example.ecommerce.domain.*
import com.example.ecommerce.domain.service.ProductPriceService

fun main() {
    val cart = Cart()
    val newCart = Cart()
    val productPriceService = ProductPriceService()
    val order = Order()

    val ipadProProduct =
        Product(ProductName.IPAD_PRO.name, productPriceService.getProducePrice(ProductName.IPAD_PRO, 100.0), 150.0)
    val heroInkPenProduct =
        Product(
            ProductName.HERO_INK_PEN.name,
            productPriceService.getProducePrice(ProductName.HERO_INK_PEN, 50.0),
            156.0
        )
    val cricketBatProduct =
        Product(
            ProductName.CRICKET_BAT.name,
            productPriceService.getProducePrice(ProductName.CRICKET_BAT, 900.0),
            120.0
        )

    val ipadProItem = CartItem(ipadProProduct, 1)
    cart.addProduct(CartItem(ipadProProduct, 1))

    cart.addProduct(CartItem(heroInkPenProduct, 1))
    cart.addProduct(CartItem(cricketBatProduct, 2))

    newCart.addProduct(ipadProItem)

    cart.removeProduct(ipadProItem)

    printCart(cart, newCart)

    order.placeOrder(cart)
    val overallPrice = order.getTotalCost(cart)
    println("Overall price of Order is $overallPrice")
}

private fun printCart(cart: Cart, newCart: Cart) {
    println("Cart ${cart.cartId}")
    println("Cart ${newCart.cartId}")

    println("Items in cart ${cart.cartItems}")

    println("Removed items:  ${cart.getDomainEvents()}")
    println("Removed items:  ${newCart.getDomainEvents()}")
}