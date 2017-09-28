import java.util.Arrays;

public class Task6Max {
    public  Integer [][] matrix;

    public  int findMaxElementAndRewriteMatrixWithoutItsRowColumn(){
        if (matrix == null) {
            return 1;
        }
        Integer maxElement = 0;
        int iMax = 0;
        int jMax = 0;

        // Find max element
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i] == null) {
                return 2;
            }
            for (int j = 0; j < matrix[i].length; j++){
                if (i==0 && j==0){
                    maxElement = matrix[i][j];
                }

                if (maxElement < matrix[i][j]){
                    maxElement = matrix[i][j];
                    iMax = i;
                    jMax = j;
                }
            }
        }

        //Rewrite matrix
        if (matrix.length == 1){
            return 3;
        }

        Integer [][] newMatrix = new Integer[matrix.length - 1][matrix[0].length - 1];
        for (int i = 0, k = 0; i < matrix.length; i++){
            if (i == iMax){
                continue;
            }
            for (int j = 0, m = 0; j < matrix[i].length; j++){
                if (j == jMax){
                    continue;
                }
                newMatrix[k][m] = matrix[i][j];
                m++;
            }
            k++;
        }

        this.matrix = newMatrix;

        return 0;
    }


}
