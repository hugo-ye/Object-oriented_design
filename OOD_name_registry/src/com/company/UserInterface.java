package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface implements AutoCloseable
{
    public UserInterface ()
    {
        scanner = new Scanner (System.in);
    }

    // returns next read name (line), return value is empty string if no
    // more names are available
    private String readName ()
    {
        if (scanner.hasNextLine ())
            return scanner.nextLine ();
        else
            return "";
    }

    // needed for implementation of AutoCloseable
    public void close ()
    {
        if (scanner != null)
            scanner.close ();
    }

    // returns an array of names read from the user
    public String[] readNames ()
    {
        ArrayList<String> array = new ArrayList<>();
        while (scanner.hasNextLine()) {
            array.add(readName());
        }
        return array.toArray(new String[0]);
    }

    // prints names, each name on a separate line
    public void showNames (String[] names)
    {
        for (String name: names) {
            System.out.println(name);
        }
    }

    private Scanner scanner;
}
