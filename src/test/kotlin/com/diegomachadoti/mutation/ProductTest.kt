package com.diegomachadoti.mutation

import org.junit.Assert
import org.junit.Ignore
import org.junit.Test

class ProductTest {

    @Test
    fun `deve retornar preço sem desconto`() {
        val product = Product()
        val amount = 2
        val price = product.getPrice(amount, false)
        Assert.assertEquals(price, 46)
    }

    @Test
    fun `deve retornar preço com desconto por valor`() {
        val product = Product()
        val amount = 100
        val price = product.getPrice(amount, false)
        Assert.assertEquals(price, 1700)
    }

    @Test
    fun `deve retornar preço com desconto por cupom`() {
        val product = Product()
        val amount = 5
        val price = product.getPrice(amount, true)
        Assert.assertEquals(price, 85)
    }

    @Test
    fun `deve retornar preço com desconto por valor = 10`() {
        val product = Product()
        val amount = 10
        val price = product.getPrice(amount, false)
        Assert.assertEquals(price, 170)
    }
}