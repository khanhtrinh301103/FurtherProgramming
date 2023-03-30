package org.example;
import javax.xml.namespace.QName;
import java.util.ArrayList;

public class OnlineBookstore {
    private ArrayList<Product> products;


    public OnlineBookstore() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void editProduct(int index, String name, int quantity, double price, boolean isDigital) {
        Product product = products.get(index);
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);
        product.setIsDigital(isDigital);
        products.set(index, product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}

