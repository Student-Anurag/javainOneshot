package twoDimensionArray;

public class transposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4},{5,6}};
        int m = mat.length;
        System.out.println(m);
        int n = mat[0].length;
        System.out.println(n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int[][] trans = new int[n][m];
        System.out.println("Transpose matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[i][j] = mat[j][i];
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
