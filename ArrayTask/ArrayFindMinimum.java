package ArrayTask;

public class ArrayFindMinimum {
    /*
        Write a function that can find the maximum number from an int Array
         */
    public static void main(String[] args) {
        int[] arrmin={25,82,4,65,3,45};
        System.out.println(minValue(arrmin));

    }
    public static int minValue(int []num){
        int min=Integer.MAX_VALUE;
        for (int each: num){
            if(each<min){
                min=each;
            }
        }return min;
    }
}
