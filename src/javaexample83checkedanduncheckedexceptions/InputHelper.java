package javaexample83checkedanduncheckedexceptions;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputHelper {

    
    public static void FeedAndSortArray (char[] array)
            throws IOException 
    {
        FeedingAndSortingArray(array);
    }
    
    // Here IOException must be declared because it is checked-exception.
    // IllegalArgumentException and ArrayIndexOutOfBoundsException are unchecked-exception (RuntimeExceptions).
    private static void FeedingAndSortingArray(char[] array)
            throws IOException 
   {

        InputStreamReader in = new InputStreamReader(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) in.read(); // throws IOException 
        }

        // Sort the first half
        Arrays.sort(array, 0, array.length / 2 + 1); // throws IllegalArgumentException and ArrayIndexOutOfBoundsException
                                                     // , which are RuntimeExceptions
    }

}
