package com.example.misc.domain

import java.util.*

class Account(private val accountId: String = UUID.randomUUID().toString(), private var address: Address) {
    override fun toString() = "Account(accountId='$accountId', address=$address)"

    fun updateAddress(newAddress: Address) {
        this.address = newAddress
    }
}