package advanceSorting;

public class quickSort {
    public static void swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partition(int[] arr,int low,int high){
        int mid = (low+high)/2;
        int pivot = arr[mid], pivotIdx = mid;
        int smallerCount = 0;
        for(int i=low;i<=high;i++){
            if(i==mid)  continue;
            if(arr[i]<=pivot)  smallerCount++;
        }
        int correctIdx = low + smallerCount;
        swap(arr,pivotIdx,correctIdx);
        // partition
        int i = low, j = high;
        while(i < correctIdx && j > correctIdx){
            if(arr[i]<=pivot)   i++;
            else if(arr[j]>pivot)   j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quicksort(int[] arr,int low,int high){
        if(low>=high)   return;
        int idx = partition(arr,low,high);
        quicksort(arr,low,idx-1);
        quicksort(arr,idx+1,high);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        int n = arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
    }
}
