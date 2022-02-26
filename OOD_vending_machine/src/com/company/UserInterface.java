package com.company;

import java.util.Scanner;

public class UserInterface implements AutoCloseable {
    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    // needed for implementation of AutoCloseable
    @Override
    public void close() {
        if (scanner != null)
            scanner.close();
    }

    // returns the product chosen by the customer
    public Product getChosenProduct(Product[] availableProducts) {
        System.out.println("Available products:");
        for (int i = 0; i < availableProducts.length; i++)
            System.out.println("id " + i + ": " + availableProducts[i]);

        Product chosenProduct = null;
        while (chosenProduct == null) {
            System.out.print("Give id of chosen item and press enter: ");
            System.out.flush();
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                if (id >= 0 && id < availableProducts.length)
                    chosenProduct = availableProducts[id];
            }

            scanner.nextLine();
        }

        return chosenProduct;
    }

    // returns true if the customer verifies payment and false otherwise
    public boolean verifyPayment(Product product) {
        System.out.printf("Verify payment (%s) (Type in true/false)", product);
        return Boolean.parseBoolean(scanner.next());

    }

    private Scanner scanner;
}
