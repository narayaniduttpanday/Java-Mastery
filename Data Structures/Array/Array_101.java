import java.io.*;
import java.lang.*;
import java.util.Scanner; // necessary import in order to take input from the user.

public class Array_101{
    public static void main(String args []){
        int arr[] = new int[10];
        arr[] = {3,5,4,8,9,6,7,10,-6,22};

        //to print the elements of the array using for-each loop
        //syntax of for-each loop: for(datatype var_name : array/collection's variable name)

        for(int i:arr){
            System.out.print(i+"");
            // output: 3,5,4,8,9,6,7,10,-6,22
        }

    }
}