package com.example.misc.domain

import java.util.*

class Customer(private val customerId: String = UUID.randomUUID().toString(), var address: Address) {
    private val bankAccounts: Accounts = Accounts()

    fun addBankAccount(bankAccount: Account) = bankAccounts.addAccount(bankAccount)

    fun updateAddress(newAddress: Address) {
        this.address = newAddress
        bankAccounts.updateAccountsAddress(address)
    }

    override fun toString() = "Customer(customerId='$customerId', address=$address, bankAccounts=$bankAccounts)"
}

