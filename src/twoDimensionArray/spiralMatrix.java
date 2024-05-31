package twoDimensionArray;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int m = mat.length; // no of rows
        int n = mat[0].length;  // no of columns
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int minr = 0, maxr = m-1;
        int minc = 0, maxc = n-1;
        while(minr<=maxr && minc<=maxc){
            // left to right
            for(int j=minc;j<=maxc;j++){
                System.out.print(mat[minr][j]+" ");
            }minr++;
            // top to bottom
            if(minr>maxr || minc>maxc)  break;
            for(int i=minr;i<=maxr;i++){
                System.out.print(mat[i][maxc]+" ");
            }maxc--;
            // right to left
            if(minr>maxr || minc>maxc)  break;
            for(int j=maxc;j>=minc;j--){
                System.out.print(mat[maxr][j]+" ");
            }maxr--;
            // bottom to top
            if(minr>maxr || minc>maxc)  break;
            for(int i=maxr;i>=minr;i--){
                System.out.print(mat[i][minc]+" ");
            }minc++;
        }
    }
}
