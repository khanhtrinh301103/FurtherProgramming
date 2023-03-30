package org.example;

public abstract class Product {

    private final String name;
    private final String description;
    private int quantity;
    private final double price;

    public Product(String name, String description, int quantity, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract String getProductType();

    public abstract String toString();

    public void setName(String name) {
        this.setName(name);
    }

    public void setPrice(double price) {
        this.setPrice(price);
    }

    public void setIsDigital(boolean isDigital) {
        this.setIsDigital(isDigital);
    }
}
