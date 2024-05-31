package Arrays;
public class rotateArray {
    public static void reverse(int[]arr, int i, int j){
        while(i<=j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int k= 3;
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
