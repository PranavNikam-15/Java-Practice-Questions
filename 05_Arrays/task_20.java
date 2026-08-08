// Task: Find the diagonal and anti-diagonal sums of a matrix.

public class task_23 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;

        int mainDiagonalSum = 0;
        int antiDiagonalSum = 0;

        for(int i=0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            antiDiagonalSum += matrix[i][n - 1 - i];
        }

        System.out.println("Diagonal Sum: " + mainDiagonalSum);
        System.out.println("Anti-Diagonal Sum: " + antiDiagonalSum);
    }
}