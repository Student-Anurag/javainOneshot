package Arrays;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {10,30,50,70,90};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr;   // shallow copy
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        nums[0] = 60;
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        // deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 40;
        System.out.println(brr[0]);
    }
}
