package com.diegomachadoti.mutation

import org.junit.Assert
import org.junit.Ignore
import org.junit.Test

class ProductTest {

    @Test
    fun `deve retornar preço sem desconto`() {
        val product = Product()
        val amount = 2 // abaixo de 10 sem cupom
        val price = product.getPrice(amount, false)
        Assert.assertEquals(price, 46) // R$ 23x2
    }

    @Test
    fun `deve retornar preço com desconto por valor`() {
        val product = Product()
        val amount = 100 // acima de 10 sem cupom
        val price = product.getPrice(amount, false)
        Assert.assertEquals(price, 1700) // R$ 17x100
    }

    @Test
    fun `deve retornar preço com desconto por cupom (valor abaixo)`() {
        val product = Product()
        val amount = 5 // abaixo de 10 com cupom
        val price = product.getPrice(amount, true)
        Assert.assertEquals(price, 85) // R$ 17x5
    }

    @Test
    fun `deve retornar preço com desconto por cupom (valor acima)`() {
        val product = Product()
        val amount = 11 // acima de 10 com cupom
        val price = product.getPrice(amount, true)
        Assert.assertEquals(price, 187) // R$ 17x11
    }

    @Ignore // Adicionar teste para cobertura apos correção do BUG
    fun `deve retornar preço com desconto por valor = 10`() {
        val product = Product()
        val amount = 10 // igual a 10 sem cupom
        val price = product.getPrice(amount, false)
        Assert.assertEquals(price, 170) // R$ 17x10
    }
}