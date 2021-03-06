// Author Tushar Grewal 
// Version 1.122
// Purpose To find index in an array using functions.
import java.util.*; 
public class Indexfx {  
    public static int findIndex(int arr[], int a) 
    {  
        if (arr == null) { 
            return -1; 
        } 
        int len = arr.length; 
        int b = 0; 
        while (b < len) { 
            if (arr[b] == a) { 
                return b; 
            } 
            else { 
                b = b + 1; 
            } 
        } 
        return -1; 
    } 
    public static void main(String[] args) 
    { 
        int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }; 
        System.out.println("Index position of 5 is: "
                           + findIndex(my_array, 5));  
        System.out.println("Index position of 7 is: "
                           + findIndex(my_array, 7)); 
    } 
} 
