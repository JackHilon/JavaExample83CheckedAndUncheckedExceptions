package javaexample83checkedanduncheckedexceptions;

import java.io.IOException;

public class JavaExample83CheckedAndUncheckedExceptions {

    
    // IOException is checked-exception, so it must be declared.
    // IllegalArgumentException and ArrayIndexOutOfBoundsException are unchecked-exception (RuntimeExceptions).
    
    
    public static void main(String[] args)
            throws IOException 
    {

        // either (throws IOException /|\) or (try-catch IOException \|/)
        
        
        char[] myArray = new char[5];

        System.out.println("Feed with " + myArray.length + " and sort this array (In another word enter a string)....");

        InputHelper.FeedAndSortArray(myArray);

        System.out.print("Your array: ");
        PrintHelper.Print(myArray);

    }

}
