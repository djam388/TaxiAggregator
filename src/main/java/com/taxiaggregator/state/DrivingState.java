package com.taxiaggregator.state;

import com.taxiaggregator.Taxi;

public class DrivingState implements TaxiState {
    @Override
    public void pressGasPedal(Taxi taxi) {
        taxi.setState(new SpeedingState());
        System.out.println("The taxi is now speeding.");
    }

    @Override
    public void pressBrakePedal(Taxi taxi) {
        taxi.setState(new StandingState());
        System.out.println("The taxi has stopped.");
    }
}