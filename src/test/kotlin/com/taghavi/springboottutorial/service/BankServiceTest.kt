package com.taghavi.springboottutorial.service

import com.taghavi.springboottutorial.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test


internal class BankServiceTest {
    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun shouldCallItsDataSourceToRetrieveBanks() {
        val banks = bankService.getBanks()

        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}