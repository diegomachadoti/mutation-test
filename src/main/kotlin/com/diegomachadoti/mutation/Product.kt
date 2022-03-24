package com.diegomachadoti.mutation

class Product {
    fun getPrice(amount: Int, coupon: Boolean): Int {
        if(amount > 10 || coupon) {
            return amount * 17
        }
        return amount * 23
    }
}