package com.nandothedeveloper.conversor.service;

import com.nandothedeveloper.conversor.model.ConversionResult;
import com.nandothedeveloper.conversor.util.ApiClient;

public class CurrencyConverterService {
    private final ApiClient apiClient;

    public CurrencyConverterService() {
        this.apiClient = new ApiClient();
    }

    public double convert(String from, String to, double amount) throws Exception {
        ConversionResult result = apiClient.fetchConversion(from, to, amount);

        if (!"success".equalsIgnoreCase(result.getResult())) {
            throw new Exception("No se pudo realizar la conversión.");
        }

        return result.getConversionResult();
    }
}
