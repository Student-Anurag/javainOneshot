package Arrays;
public class sortZeroesandOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,1,0,0,1};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i= 0;
        int j = n-1;
        while (i<j){
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
            // if(i>j) break;
            if(i<j && arr[i] ==1 && arr[j] == 0){
                int tmp =arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        System.out.println("Array after sorting: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
