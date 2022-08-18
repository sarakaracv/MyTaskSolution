package ArrayTask;

public class ArrayFindMaximum {
        /*
            Write a function that can find the maximum number from an int Array
         */
        public static void main(String[] args) {
            int[] arr = {1, 5, 7, 2, 8, 6};

            System.out.println(maxValue(arr));
        }
//max num asg MINVALUE
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


