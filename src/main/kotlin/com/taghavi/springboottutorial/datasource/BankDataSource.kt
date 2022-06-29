package com.taghavi.springboottutorial.datasource

import com.taghavi.springboottutorial.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}