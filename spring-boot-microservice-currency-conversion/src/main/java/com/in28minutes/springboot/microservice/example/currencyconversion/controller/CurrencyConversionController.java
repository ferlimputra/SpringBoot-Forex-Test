package com.in28minutes.springboot.microservice.example.currencyconversion.controller;

import java.math.BigDecimal;

import com.in28minutes.springboot.microservice.example.currencyconversion.bean.CurrencyConversionBean;
import com.in28minutes.springboot.microservice.example.currencyconversion.proxy.CurrencyExchangeServiceProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * CurrencyConversionController
 */
@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyExchangeServiceProxy proxy;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
            @PathVariable BigDecimal quantity) {
        CurrencyConversionBean response = proxy.getExchangeValue(from, to);
        return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiplier(), quantity,
                quantity.multiply(response.getConversionMultiplier()), response.getPort());
    }
}