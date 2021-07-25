package pl.senti.currencyexchangeservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CurrencyExchange {

    @Id
    private Long id;
    private String currencyFrom;
    private String currencyTo;
    private BigDecimal conversionMultiple;
    private String environment;

    public CurrencyExchange() {
    }

    public CurrencyExchange(Long id, String currencyFrom, String currencyTo, BigDecimal conversionMultiple) {
        this.id = id;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
