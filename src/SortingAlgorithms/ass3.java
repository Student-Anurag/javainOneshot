package SortingAlgorithms;
import java.util.Arrays;
public class ass3 {
    public static void main(String[] args) {
        int[] arr = {7,18,9,11,4,5,14};
        int n = arr.length;
        int k = 3;
        Arrays.sort(arr);
        System.out.print("Kth smallest element is: "+arr[k-1]);
    }
}
