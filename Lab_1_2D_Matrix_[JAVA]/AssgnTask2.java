//Assignment Task 02: Matrix Compression
class AssgnTask2 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix(Integer[][] matrix) {

        int rows=matrix.length;
        int cols=matrix[0].length;
        // For this task you'll need to create new 2D array
        Integer[][] newMat =new Integer[rows/2][cols/2];
        for(int i=0;i<rows/2;i++){
            for(int j=0;j<cols/2;j++){
                newMat[i][j]=0;
            }
        }
        // TO DO
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                newMat[i/2][j/2]+=matrix[i][j];
            }
        }
        // remove the line below and return the newly created Compressed 2D matrix
        return newMat;
    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 3, 5, 2 },
                { -2, 0, 6, -3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);

        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");

        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix(matrix);
        Arr.print2D(returnedArray);
    }
}
