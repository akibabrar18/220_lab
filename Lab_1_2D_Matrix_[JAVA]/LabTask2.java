//Lab Task 02: Decryption Process
class LabTask2{
    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        //For this task you'll need to create new arrays
        //we recommend you to use Integer type.
        //example:  Integer[] array = new Integer[5]
        Integer[] arr =new Integer[matrix[0].length-1];
        int prevSum=0,idx=0;
        for(int j=0;j<matrix[0].length;j++){
            int currSum=0;
            for(int i=0;i<matrix.length;i++){
                currSum+=matrix[i][j];
            }
            if(prevSum!=0){
                arr[idx++]=currSum-prevSum;
            }
            prevSum=currSum;
        }        
        return arr;

        //TO DO
        //DELETE the following return statement when you're ready to return the 2D array
        

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}
