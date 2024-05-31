package SortingAlgorithms;
import java.util.Scanner;
public class optimizedBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // optimized bubble sort
        for(int i=0;i<n-1;i++){
            boolean flag = true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag) break;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
