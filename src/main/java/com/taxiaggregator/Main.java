package com.taxiaggregator;

import com.taxiaggregator.strategy.*;
import com.taxiaggregator.memento.*;
import com.taxiaggregator.visitor.*;

public class Main {
    public static void main(String[] args) {

        Tariff economyTariff = new EconomyTariff();
        Taxi taxi = new Taxi(economyTariff, "John Doe");

        Tariff premiumTariff = new PremiumTariff();
        taxi.setTariff(premiumTariff);

        taxi.pressGasPedal();
        taxi.pressGasPedal();
        taxi.pressGasPedal();

        taxi.pressBrakePedal();
        taxi.pressBrakePedal();
        taxi.pressBrakePedal();

        TaxiMemento savedState = taxi.saveState();

        taxi.restoreState(savedState);

        TaxiVisitor xmlVisitor = new XmlVisitor();
        TaxiVisitor jsonVisitor = new JsonVisitor();

        taxi.accept(xmlVisitor);
        taxi.accept(jsonVisitor);
    }
}
