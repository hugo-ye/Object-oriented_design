package com.company;

public class VendingMachine implements AutoCloseable
{
    public VendingMachine ()
    {
        this.shelf = new Shelf ();
        this.ui = new UserInterface ();
    }

    // application logic
    public void run ()
    {
        while (!shelf.isEmpty ())
        {
            Product[] availableProducts = shelf.getAvailableProducts ();
            Product purchasedProduct = ui.getChosenProduct (availableProducts);
            if (ui.verifyPayment (purchasedProduct))
                shelf.dispense (purchasedProduct);
        }
    }

    @Override
    public void close ()
    {
        if (ui != null)
            ui.close ();
    }

    private Shelf shelf;
    private UserInterface ui;
}
