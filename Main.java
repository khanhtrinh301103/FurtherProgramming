package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        OnlineBookstore bookstore = new OnlineBookstore();
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = null;
        String choice = "";
        while (!choice.equals("8")) {
            System.out.println("Welcome to the Bookstore!");
            System.out.println("1. View all books");
            System.out.println("2. Add a book");
            System.out.println("3. Edit a book");
            System.out.println("4. Create a shopping cart");
            System.out.println("5. Add a product to the cart");
            System.out.println("6. Remove a product from the cart");
            System.out.println("7. View cart amount");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println(bookstore);
                    break;
                case "2":
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter book's description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter quantity available: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Is this a digital book? (y/n): ");
                    String digitalChoice = scanner.nextLine();
                    boolean isDigital = false;
                    if (digitalChoice.equalsIgnoreCase("y")) {
                        isDigital = true;
                    }
                    boolean added = bookstore.addProduct(name, description, quantity, price, isDigital);
                    if (added) {
                        System.out.println("Book added successfully!");
                    } else {
                        System.out.println("Book could not be added.");
                    }
                    break;
                case "3":
                    System.out.print("Enter book name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter new book name (leave blank if no change): ");
                    String newName = scanner.nextLine();
                    if (newName.equals("")) {
                        newName = productName;
                    }
                    System.out.print("Enter new book's description (leave blank if no change): ");
                    String newDescription = scanner.nextLine();
                    System.out.print("Enter new quantity available (leave blank if no change): ");
                    String newQuantityString = scanner.nextLine();
                    int newQuantity = -1;
                    if (!newQuantityString.equals("")) {
                        newQuantity = Integer.parseInt(newQuantityString);
                    }
                    System.out.print("Enter new price (leave blank if no change): ");
                    String newPriceString = scanner.nextLine();
                    double newPrice = -1;
                    if (!newPriceString.equals("")) {
                        newPrice = Double.parseDouble(newPriceString);
                    }
                    boolean edited = bookstore.editProduct(productName, newName, newDescription, newQuantity, newPrice);
                    if (edited) {
                        System.out.println("Book edited successfully!");
                    } else {
                        System.out.println("Book could not be edited.");
                    }
                    break;
                case "4":
                    System.out.println("Creating new shopping cart...");
                    cart = new ShoppingCart();
                    break;
                case "5":
                    if (cart == null) {
                        System.out.println("Please create a shopping cart first.");
                    } else {
                        System.out.print("Enter book's name: ");
                        String cartProductName = scanner.nextLine();
                        boolean addedToCart = cart.addItem(cartProductName, bookstore.getProducts());
                        if (addedToCart) {
                            System.out.println("Product added to cart successfully!");
                        } else {
                            System.out.println("Product could not be added to cart.");
                        }
                    }
            }
        }
    }
}
