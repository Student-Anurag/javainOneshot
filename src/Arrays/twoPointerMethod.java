package Arrays;
import java.util.Arrays;
public class twoPointerMethod {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int i=0,j=n-1;i<=j;i++,j--) {   // using while loop --->    int i = 0;
            int tmp = arr[i];               //                          int j = n-1;
            arr[i] = arr[j];                //                          while(i<=j){
            arr[j] = tmp;                   //                             statement;
            i++;                            //                             }
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
