package com.taxiaggregator.state;

import com.taxiaggregator.Taxi;

public class SpeedingState implements TaxiState {
    @Override
    public void pressGasPedal(Taxi taxi) {
        System.out.println("The taxi is already speeding.");
    }

    @Override
    public void pressBrakePedal(Taxi taxi) {
        taxi.setState(new DrivingState());
        System.out.println("The taxi is now driving.");
    }
}