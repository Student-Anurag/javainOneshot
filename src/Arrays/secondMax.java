package Arrays;
import java.util.Scanner;
public class secondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(arr[i],max);
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                smax = Math.max(smax,arr[i]);
            }
        }
        System.out.println("Second Maximum of all elements: "+smax);
    }
}
