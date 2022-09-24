package array_tasks;

import java.util.Arrays;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2, 8, 6};

        System.out.println(maxValue(arr));
    }

    public static int maxValue(int[] num) {
        int max = Integer.MIN_VALUE;
        for (int each : num) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

}


//    public static int maxValue(int[] n) {
//
//        int max = Integer.MIN_VALUE;
//
//        for (int each : n) {
//            if (each > max) {
//                max = each;
//            }
//        }
//
//        return max;
//    }
//
//
//}
