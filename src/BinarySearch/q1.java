package BinarySearch;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1};
        int n = arr.length;
        int low = 0, high = n-1;
        int count = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==1 && arr[mid-1]==0){
                low = mid+1;
                count++;
            }
            else if(arr[mid]==0){
                low = mid+1;
            }
        }
        System.out.println(count);
    }
}
