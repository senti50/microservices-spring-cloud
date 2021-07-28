package pl.senti.currencyconversionservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.senti.currencyconversionservice.model.CurrencyConversion;

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion getExchangeValue(@PathVariable String from, @PathVariable String to);
}
