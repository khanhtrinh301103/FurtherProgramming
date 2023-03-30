package org.example;

public class PhysicalGiftProduct extends GiftProduct {

    private final double weight;

    public PhysicalGiftProduct(String name, String description, int quantity, double price, double weight) {
        super(name, description, quantity, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String getProductType() {
        return "PHYSICAL_GIFT";
    }

    @Override
    public String toString() {
        return getProductType() + " - " + getName();
    }
}


