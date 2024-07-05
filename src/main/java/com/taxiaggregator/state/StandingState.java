package com.taxiaggregator.state;

import com.taxiaggregator.Taxi;

public class StandingState implements TaxiState {
    @Override
    public void pressGasPedal(Taxi taxi) {
        taxi.setState(new DrivingState());
        System.out.println("The taxi is now driving.");
    }

    @Override
    public void pressBrakePedal(Taxi taxi) {
        System.out.println("The taxi is already standing.");
    }
}