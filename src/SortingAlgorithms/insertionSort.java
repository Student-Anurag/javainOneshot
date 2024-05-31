package SortingAlgorithms;

public class insertionSort {
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
        int[] arr = {5,3,1,4,2};
        int n = arr.length;
        print(arr);
        // Insertion sort algorithm
        for(int i=1;i<n;i++){
           int j = i;
           while(j>=1 && arr[j]<arr[j-1]){
               swap(arr,j,j-1);
               j--;
           }
        }
        print(arr);
    }
}
