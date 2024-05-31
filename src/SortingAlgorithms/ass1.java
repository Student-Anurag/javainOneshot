package SortingAlgorithms;

import java.util.Arrays;

public class ass1 {
    public static void main(String[] args) {
        int[] arr = {5,9,2,0,4};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.print("Minimum possible sum: "+(arr[0]+arr[1]));
    }
}
