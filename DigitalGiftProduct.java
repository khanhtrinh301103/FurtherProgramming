package org.example;

public class DigitalGiftProduct extends GiftProduct {

    public DigitalGiftProduct(String name, String description, int quantity, double price) {
        super(name, description, quantity, price);
    }

    @Override
    public String getProductType() {
        return "DIGITAL_GIFT";
    }

    @Override
    public String toString() {
        return getProductType() + " - " + getName();
    }
}

