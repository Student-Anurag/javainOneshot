package Arrays;
import java.util.Arrays;
public class forEachLoop {
    public static void main(String[] args) {
        int[] arr = {9,5,0,2,45,7};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
