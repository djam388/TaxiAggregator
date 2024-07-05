package com.taxiaggregator.strategy;

public class PremiumTariff implements Tariff {
    @Override
    public double calculateCost(double distance) {
        return distance * 2.0;
    }
}
