import java.util.Scanner;

public class Array04 {
    public static int findSecondMax(int[] a) {
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;
        for (int i : a) {
            if (i > max) {
                s_max = max;
                max = i;
            } else if (i > s_max && i < max) {
                s_max = i;
            }
        }
        return s_max;
    }

    public static int findSecondMin(int[] a) {
        int min = Integer.MAX_VALUE;
        int s_min = Integer.MAX_VALUE;
        for (int i : a) {
            if (i < min) {
                s_min = min;
                min = i;
            } else if (i < s_min && i > min) {
                s_min = i;
            }
        }
        return s_min;
    }

    public static void main(String[] args) {
        int arr[] = {54, 36, 85, 11, -9, 3333, -6, 0, 52, 75, 84, 2564};
        System.out.println("The second largest value is: " + findSecondMax(arr));
        System.out.println("The second smallest value is: " + findSecondMin(arr));
    }
}
