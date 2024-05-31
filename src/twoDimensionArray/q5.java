package twoDimensionArray;

public class q5 {
    public static void main(String[] args) {
        int[][] arr = {{9,3,5,7},{3,4,7,8},{1,4,12,3}};
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int maxSum = 0;
        int maxRow = -1;
        for(int j=0;j<m;j++){
            int rowSum = 0;
            for(int i=0;i<m;i++) {
                rowSum += arr[i][j];
            }
            if(rowSum>maxSum){
                maxSum = rowSum;
                maxRow = j;
            }
        }
        System.out.println("Row with max sum: "+maxRow);
    }
}
