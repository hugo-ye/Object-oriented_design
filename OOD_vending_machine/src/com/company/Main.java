package com.company;

public class Main
{
    public static void main (String[] args)
    {
        try (VendingMachine vendingMachine = new VendingMachine ())
        {
            vendingMachine.run ();
        }
        catch (Exception e)
        {
            System.out.println ("got exception [ " + e + " ], exiting...");
            System.exit (1);
        }
    }
}