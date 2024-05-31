package twoDimensionArray;
import java.util.Scanner;
public class maxIn2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j] > max) max = arr[i][j];
            }
        }
        System.out.println("Maximum of all elements present in 2D array: "+ max);
    }
}
