// WAP in Java to add the elements of the array.

import java.util.Scanner;
public class Array02{
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);

        int arr[] = new int[10];
        System.out.println("Enter the values in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]= am.nextInt();
        }
        int sum = 0;
        for(int i: arr){
            sum+=i;
        }
        System.out.print("The sum of the elements of the array is: "+sum);
    }
}