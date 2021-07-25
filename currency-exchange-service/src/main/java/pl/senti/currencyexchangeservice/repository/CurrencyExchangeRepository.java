package pl.senti.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import pl.senti.currencyexchangeservice.model.CurrencyExchange;

@RestController
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByCurrencyFromAndAndCurrencyTo(String from, String to);
}
