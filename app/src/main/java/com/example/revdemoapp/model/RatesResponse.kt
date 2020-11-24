package com.example.revdemoapp.model

data class RatesResponse(val baseCurrency: String,
                         val rates: Map<String, Double>)
