package com.taxiaggregator.state;

import com.taxiaggregator.Taxi;

public interface TaxiState {
    void pressGasPedal(Taxi taxi);
    void pressBrakePedal(Taxi taxi);
}