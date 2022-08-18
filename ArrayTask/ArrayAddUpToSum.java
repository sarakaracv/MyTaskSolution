import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayAddUpToSum {
    /*
     given an int[] 'arr' and another int 'sum',
     Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
        Example:
         Output:
           {8=2, 7=3}

     */
    public static void main(String[] args) {


        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;


        Map<Integer, Integer> sumpair= new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {
                if (arr[i]+arr[i1]==sum){
                    sumpair.put(arr[i],arr[i1] );
                }
            }

        }
        System.out.println(sumpair);


    }
}
