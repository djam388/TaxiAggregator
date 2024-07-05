package com.taxiaggregator.visitor;

import com.taxiaggregator.Taxi;

public class XmlVisitor implements TaxiVisitor {
    @Override
    public void visit(Taxi taxi) {
        System.out.println("Saving taxi state: XML format");
    }
}