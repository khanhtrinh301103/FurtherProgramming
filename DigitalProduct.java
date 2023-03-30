package org.example;

public class DigitalProduct extends Product {

    public DigitalProduct(String name, String description, int quantity, double price) {
        super(name, description, quantity, price);
    }

    @Override
    public String getProductType() {
        return "DIGITAL";
    }

    @Override
    public String toString() {
        return getProductType() + " - " + getName();
    }
}
