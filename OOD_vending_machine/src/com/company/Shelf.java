package com.company;

public class Shelf
{
    public Shelf ()
    {
        final int NUM_PRODUCT_TYPES = 4;
        products = new Product [NUM_PRODUCT_TYPES];
        quantities = new int [NUM_PRODUCT_TYPES];

        products [0] = Product.Beverage;
        quantities [0] = 2;
        products [1] = Product.Apple;
        quantities [1] = 1;
        products [2] = Product.Banana;
        quantities [2] = 4;
        products [3] = Product.Chocolate;
        quantities [3] = 5;
    }

    // returns an array of products available (for which quantity is positive)
    public Product[] getAvailableProducts ()
    {
        java.util.ArrayList<Product> availableProducts = new java.util.ArrayList<> ();
        for (int i = 0; i < products.length; i++)
            if (quantities [i] > 0)
                availableProducts.add (products [i]);

        return availableProducts.toArray (new Product [0]);
    }

    // returns true if there are no more products to be sold and false
    // otherwise
    public boolean isEmpty ()
    {
        return quantities[0] == 0 && quantities[1] == 0 && quantities[2] == 0 && quantities[3] == 0;
    }

    // dispenses a product (that is, in this simple app just decreases
    // its quantity by 1)
    public void dispense (Product product)
    {
        quantities[product.ordinal()] -=1;
    }

    Product[] products;
    int[] quantities;
}
