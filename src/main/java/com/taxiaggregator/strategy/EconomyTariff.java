package com.taxiaggregator.strategy;

public class EconomyTariff implements Tariff {
    @Override
    public double calculateCost(double distance) {
        return distance * 1.0;
    }
}