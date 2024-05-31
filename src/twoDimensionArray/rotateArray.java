package twoDimensionArray;

public class rotateArray {
    public static void print(int[][] arr){
        int m = arr.length;
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};     // only valid for square matrix
        int m = mat.length;
        System.out.println("Matrix is: ");
        print(mat);
        System.out.println("Matrix after rotation: ");
        // finding transpose first
        for(int i = 0;i<m;i++){
            for(int j=0;j<i;j++){
                int tmp = mat[i][j];                //   1 4 7
                mat[i][j] = mat[j][i];              //   2 5 8
                mat[j][i] = tmp;                    //   3 6 9
            }
        }
        for(int i=0;i<m;i++){
            int a = 0, b = m-1;
            while(a<b){
                // row is fixed
                int tmp = mat[i][a];
                mat[i][a] = mat[i][b];
                mat[i][b] = tmp;
                a++;
                b--;
            }
        }
        print(mat);
    }
}
