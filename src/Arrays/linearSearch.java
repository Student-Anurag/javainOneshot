package Arrays;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter target element: ");
        int x = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i]==x) {
                flag = true;
                break;
            }
        }
        if(flag==true) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
