package org.example;

public abstract class GiftProduct extends Product {

    private String message;

    public GiftProduct(String name, String description, int quantity, double price) {
        super(name, description, quantity, price);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

