package Arrays;

public class dutchFlagAlgo {
    public static void main(String[] args) {
        int[] arr = {0,2,1,1,0,0,2,0,1,1,0};
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int tmp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = tmp;
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                // arr[mid]==2
                int tmp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = tmp;
                high--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
