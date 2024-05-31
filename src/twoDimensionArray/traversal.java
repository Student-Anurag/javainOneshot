package twoDimensionArray;
import java.util.Scanner;
public class traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        // taking input from the user
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // printing output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
