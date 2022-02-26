package com.company;

public class NameRegister
{
    // sets the names in the register
    public void setNames (String[] names)
    {
        nameList = names;
    }

    // return an array of current names in register
    public String[] getNames ()
    {
        // code to be written here
        return nameList; // this line must be deleted
    }

    String[] nameList;
}