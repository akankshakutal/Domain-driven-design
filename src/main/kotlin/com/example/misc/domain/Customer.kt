package com.example.misc.domain

import java.util.*

class Customer(private val customerId: String = UUID.randomUUID().toString(), var address: Address) {
    private val bankAccounts: MutableList<Account> = mutableListOf()

    fun addBankAccount(bankAccount: Account) = bankAccounts.add(bankAccount)

    fun updateAddress(newAddress: Address) {
        this.address = newAddress
        bankAccounts.forEach { it.updateAddress(newAddress) }
    }

    override fun toString() = "Customer(customerId='$customerId', address=$address, bankAccounts=$bankAccounts)"
}

