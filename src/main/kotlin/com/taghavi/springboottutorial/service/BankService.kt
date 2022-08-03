package com.taghavi.springboottutorial.service

import com.taghavi.springboottutorial.datasource.BankDataSource
import com.taghavi.springboottutorial.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}