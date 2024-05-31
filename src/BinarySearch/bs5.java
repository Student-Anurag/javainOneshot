package BinarySearch;

public class bs5 {
    public static void main(String[] args) {
        int num = 56;
        int low = 0, high = num;
        boolean flag = false;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid*mid==num) {
                flag = true;
                break;
            }
            else if(mid*mid>num) high = mid-1;
            else low = mid+1;
        }
        if(flag) System.out.println(num+" is a perfect square");
        else System.out.println(num+" is not a perfect square");
    }
}
