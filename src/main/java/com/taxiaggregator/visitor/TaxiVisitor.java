package com.taxiaggregator.visitor;

import com.taxiaggregator.Taxi;

public interface TaxiVisitor {
    void visit(Taxi taxi);
}
