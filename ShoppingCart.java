package org.example;
import java.util.*;
public class ShoppingCart {
    private Set<String> items;
    private double totalWeight;

    public ShoppingCart() {
        this.items = new HashSet<>();
        this.totalWeight = 0.0;
    }

    public boolean addItem(String productName, List<Product> products) {
        for (Product product : products) {
            if (product.getName().equals(productName) && product.getQuantity() > 0) {
                product.setQuantity(product.getQuantity() - 1);
                items.add(productName);
                if (product instanceof PhysicalProduct) {
                    totalWeight += ((PhysicalProduct) product).getWeight();
                }
                return true;
            }
        }
        return false;
    }

    public boolean removeItem(String productName, List<Product> products) {
        if (items.contains(productName)) {
            for (Product product : products) {
                if (product.getName().equals(productName)) {
                    product.setQuantity(product.getQuantity() + 1);
                    items.remove(productName);
                    if (product instanceof PhysicalProduct) {
                        totalWeight -= ((PhysicalProduct) product).getWeight();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public double cartAmount(List<Product> products) {
        double total = 0.0;
        for (String itemName : items) {
            for (Product product : products) {
                if (product.getName().equals(itemName)) {
                    total += product.getPrice();
                }
            }
        }
        if (totalWeight > 0.0) {
            total += totalWeight * 0.1;
        }
        return total;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "ShoppingCart [items=" + items + ", totalWeight=" + totalWeight + "]";
    }
}

