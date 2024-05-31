package SortingAlgorithms;
import java.util.Scanner;
public class checkSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Sorted Array...");
        }
        else{
            System.out.println("Unsorted Array...");
        }
    }
}
