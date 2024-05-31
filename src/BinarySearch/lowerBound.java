package BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140};
        int n = arr.length;
        int lb = n;
        int x = 90;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=x){
                lb = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(lb);
    }
}
