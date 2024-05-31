package Recursion;
import java.util.Scanner;
public class arrayTraversal {
    public static void traverseArray(int i,int[] arr){
        if(i==arr.length)  return;
        System.out.print(arr[i]+" ");
        traverseArray(i+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        traverseArray(0,arr);
    }
}
