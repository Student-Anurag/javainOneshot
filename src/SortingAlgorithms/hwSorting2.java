package SortingAlgorithms;

public class hwSorting2 {
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
        for(int i=n-1;i>0;i--){
            int max = Integer.MIN_VALUE;
            int idx = -1;
            for(int j=i;j>=0;j--){
                if(arr[j]>max){
                    max = arr[j];
                    idx = j;
                }
            }
            // swap arr[i] and arr[idx]
            swap(arr,i,idx);
        }
        print(arr);
    }
}
