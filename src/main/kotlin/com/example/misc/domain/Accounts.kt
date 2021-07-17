package com.example.misc.domain

class Accounts(private val accounts: MutableList<Account> = mutableListOf()) {
    fun updateAccountsAddress(newAddress: Address) {
        accounts.forEach { it.updateAddress(newAddress) }
    }

    fun addAccount(account: Account) {
        accounts.add(account)
    }

    override fun toString()= "Accounts(accounts=$accounts)"
}