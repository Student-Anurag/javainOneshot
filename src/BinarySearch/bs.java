package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int[] arr ={10,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 107;
        int low = 0;
        int high = n-1;
        boolean flag = false;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                flag = true;
                break;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
        }
        if(flag) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
