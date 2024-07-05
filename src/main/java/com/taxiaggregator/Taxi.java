package com.taxiaggregator;

import com.taxiaggregator.strategy.*;
import com.taxiaggregator.state.*;
import com.taxiaggregator.memento.*;
import com.taxiaggregator.visitor.*;

public class Taxi {
    private TaxiState state;
    private Tariff tariff;
    private double mileage;
    private String driver;

    public Taxi(Tariff initialTariff, String driver) {
        this.tariff = initialTariff;
        this.driver = driver;
        this.state = new StandingState();
        this.mileage = 0;
    }

    public void setState(TaxiState newState) {
        this.state = newState;
    }

    public void pressGasPedal() {
        state.pressGasPedal(this);
    }

    public void pressBrakePedal() {
        state.pressBrakePedal(this);
    }

    public void setTariff(Tariff newTariff) {
        this.tariff = newTariff;
    }

    public double calculateCost(double distance) {
        return tariff.calculateCost(distance);
    }

    public TaxiMemento saveState() {
        return new TaxiMemento(mileage, driver, state);
    }

    public void restoreState(TaxiMemento memento) {
        this.mileage = memento.getMileage();
        this.driver = memento.getDriver();
        this.state = memento.getState();
    }

    public void accept(TaxiVisitor visitor) {
        visitor.visit(this);
    }
}
