package com.example.misc

import com.example.misc.domain.Account
import com.example.misc.domain.Address
import com.example.misc.domain.Customer

fun main() {
    val bankAccount = Account(address = Address(city = "Pune"))
    val customer = Customer(address = Address(city = "Pune"))

    customer.addBankAccount(bankAccount)
    customer.updateAddress(Address("Mumbai"))

    println("Customer Details: $customer")
}

