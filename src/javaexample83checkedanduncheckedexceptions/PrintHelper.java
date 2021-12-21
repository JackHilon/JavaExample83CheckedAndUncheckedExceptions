
package javaexample83checkedanduncheckedexceptions;


public class PrintHelper {
 
    public static void Print(char[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
