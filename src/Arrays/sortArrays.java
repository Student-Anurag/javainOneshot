package Arrays;
import java.util.Arrays;
public class sortArrays {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,0,1,0,0};
        int n = arr.length;
        System.out.println("Array is: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++) {
                if (arr[i] == 1 && arr[j] == 0) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Array after sorting: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
