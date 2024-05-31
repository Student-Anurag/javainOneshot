package SortingAlgorithms;

public class selectionSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        print(arr);
        // Selection sort algo
        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            // swap arr[i] and arr[idx]
            swap(arr,i,min_idx);
        }
        print(arr);
    }
}
