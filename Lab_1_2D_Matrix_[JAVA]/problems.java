import java.util.ArrayList;

public class problems {
    // 54. Spiral Matrix
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        int srow = 0, scol = 0, erow = matrix.length - 1, ecol = matrix[0].length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (srow <= erow && scol <= ecol) {
            // Top
            for (int j = scol; j <= ecol; j++) {
                list.add(matrix[srow][j]);
            }
            // Right
            for (int i = srow + 1; i <= erow; i++) {
                list.add(matrix[i][ecol]);
            }
            // Bottom
            if (srow != erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    list.add(matrix[erow][j]);
                }
            }
            // Left
            if (scol != ecol) {
                for (int i = erow - 1; i > srow; i--) {
                    list.add(matrix[i][scol]);
                }
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        return list;
    }

    // 1572. Matrix Diagonal Sum
    // O(n*n)
    public int diagonalSum1(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j)
                    sum += mat[i][j];
                else if (i + j == mat.length - 1)
                    sum += mat[i][j];
            }
        }
        return sum;
    }

    // O(n)
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != mat.length - 1 - i)
                sum += mat[i][mat.length - 1 - i];
        }
        return sum;
    }

    // 74. Search a 2D Matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == target)
                return true;
            else if (target > matrix[row][col])
                col++;
            else if (target < matrix[row][col])
                row--;
        }
        return false;
    }

    static void swapCol(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int j = 0; j < cols / 2; j++) {
            for (int i = 0; i < rows; i++) {
                int ecol = cols - 1 - j;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][ecol];
                matrix[i][ecol] = temp;
            }
        }
    }

    public static int[][] MatrixMultiplication(int[][] m1, int[][] m2) {
        int m1Rlen = m1.length;
        int m2Clen = m2[0].length;
        int m1Clen = m1[0].length;
        int[][] newMatrix = new int[m1Rlen][m2Clen];
        for (int r = 0; r < m1Rlen; r++) {
            for (int c = 0; c < m2Clen; c++) {
                int sum = 0;
                for (int k = 0; k < m1Clen; k++) {
                    sum += m1[r][k] * m2[k][c];
                }
                newMatrix[r][c] = sum;
            }
        }
        return newMatrix;
    }


    //498. Diagonal Traverse
    public static int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] res=new int[m*n];
        int i=0,j=0;
        for(int k=0;k<m*n;k++){
            res[k]=mat[i][j];
            if((i+j)%2==0){
                //right
                if(j==m-1) i++;
                //top
                else if(i==0) j++;
                else{
                    i--;
                    j++;
                }
            }
            else{
                //bottom
                if(i==n-1) j++;
                //left
                else if(j==0) i++;
                else{
                    i++;
                    j--;
                }
            }
        }
        return res;
    }



    //Diagonal Traversal of matrix 
     public static ArrayList<Integer> DiagonalTraversal(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int k=0;k<n;k++){
            int i=k,j=0;
            while(i>=0 && j<m){
                list.add(matrix[i][j]);
                i--;
                j++;
            }
        }
        for(int k=1;k<m;k++){
            int j=k,i=n-1;
            while(i>=0 && j<m){
                list.add(matrix[i][j]);
                i--;
                j++;
            }
        }
        return list;
    }
}
