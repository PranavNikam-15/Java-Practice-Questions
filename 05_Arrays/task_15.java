// Task: Find row-wise and column-wise sums of a matrix.

public class task_18 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i < rows; i++) {
            int rowSum = 0;

            for(int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }

            System.out.println("Sum of row " + i + ": " + rowSum);
        }

        for(int j=0; j < cols; j++) {
            int colSum = 0;
            
            for(int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of col " + j + ": " + colSum);
        }
    }
}