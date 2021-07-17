package com.example.misc.domain

import java.util.*

class Account(private val accountNumber: String = UUID.randomUUID().toString(), private var address: Address) {
    override fun toString() = "Account(accountId='$accountNumber', address=$address)"

    fun updateAddress(newAddress: Address) {
        this.address = newAddress
    }
}