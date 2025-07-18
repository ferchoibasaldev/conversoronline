package com.nandothedeveloper.conversor.model;

public class ConversionResult {
    private final String result;
    private final double conversionRate;
    private final double conversionResult;

    public ConversionResult(String result, double conversionRate, double conversionResult) {
        this.result = result;
        this.conversionRate = conversionRate;
        this.conversionResult = conversionResult;
    }

    public String getResult() {
        return result;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public double getConversionResult() {
        return conversionResult;
    }
}
