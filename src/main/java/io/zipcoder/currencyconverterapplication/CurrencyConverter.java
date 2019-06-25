package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public CurrencyConverter() {
    }

    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        return sourceCurrencyType.convert(targetCurrencyType) * amountOfBaseCurrency;
    }
}
