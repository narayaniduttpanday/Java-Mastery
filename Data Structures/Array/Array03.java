//WAP in java to find the maximum and minimum element in an array
import java.util.*;

public class Array03{
    //function to find the max value
    public static int findMax(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i: a){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
    //function to find the min value
    public static int findMin(int a[]){
        int min = Integer.MAX_VALUE;

        for(int i: a){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
    public static void main(String args []){
        int arr[] = {12,14,67,-98,-3333,67890,45,00,89};

        System.out.println("The maximum value is: "+findMax(arr));
        System.out.println("The minimum value is: "+findMin(arr));
    }
}