package Arrays;
import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        System.out.println("Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // reversing
        for(int i=0;i<n/2;i++){
            int j = n-i-1;
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        System.out.println("Reversed array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
