package com.company;

enum Product
{
    Beverage (120), Apple (65), Banana (35), Chocolate (200); // product types with their prices in cents

    private int priceCents;

    Product (int priceCents)
    {
        this.priceCents = priceCents;
    }

    public int getPriceCents ()
    {
        return priceCents;
    }

    public String toString ()
    {
        return (name ()) + " (" + priceCents + " cents)";
    }
}
