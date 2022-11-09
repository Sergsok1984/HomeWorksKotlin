package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcCommissionMasterCardCommission() {
        val typeCard = "MasterCard/Maestro"
        val amountMonth = 75_000
        val amountTransfer = 10_000

        val commission = calcCommission(typeCard, amountMonth, amountTransfer)

        assertEquals(80, commission)
    }

    @Test
    fun calcCommissionMasterCardNoCommission() {
        val typeCard = "MasterCard/Maestro"
        val amountMonth = 10_000
        val amountTransfer = 10_000

        val commission = calcCommission(typeCard, amountMonth, amountTransfer)

        assertEquals(0, commission)
    }

    @Test
    fun calcCommissionVisaMinCommission() {
        val typeCard = "Visa/Mir"
        val amountMonth = 0
        val amountTransfer = 100

        val commission = calcCommission(typeCard, amountMonth, amountTransfer)

        assertEquals(35, commission)
    }

    @Test
    fun calcCommissionVisaCommission() {
        val typeCard = "Visa/Mir"
        val amountMonth = 0
        val amountTransfer = 10_000

        val commission = calcCommission(typeCard, amountMonth, amountTransfer)

        assertEquals(75, commission)
    }

    @Test
    fun calcCommissionVKPayNoCommission() {
        val typeCard = "VK Pay"
        val amountMonth = 80_000
        val amountTransfer = 80_000

        val commission = calcCommission(typeCard, amountMonth, amountTransfer)

        assertEquals(0, commission)
    }
}