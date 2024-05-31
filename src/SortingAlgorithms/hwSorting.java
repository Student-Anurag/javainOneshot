package SortingAlgorithms;

public class hwSorting {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
