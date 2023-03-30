package org.example;

public class PhysicalProduct extends Product {

    private final double weight;

    public PhysicalProduct(String name, String description, int quantity, double price, double weight) {
        super(name, description, quantity, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String getProductType() {
        return "PHYSICAL";
    }

    @Override
    public String toString() {
        return getProductType() + " - " + getName();
    }
}
