package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Product {
    private String name;
    private double cost;

    PropertyChangeListener listener;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {

        PropertyChangeEvent evt = new PropertyChangeEvent(
                this,
        "COST_CHANGED",
                this.cost,
                cost);
        this.cost = cost;

        this.listener.propertyChange(evt);
    }

    public PropertyChangeListener getListener() {
        return listener;
    }

    public void setListener(PropertyChangeListener listener) {
        this.listener = listener;
    }
}
