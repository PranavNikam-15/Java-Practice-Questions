// Task: Perform matrix multiplication.

public class task_21 {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int r1 = a.length;
        int c1 = a[0].length;
        int c2 = b[0].length;

        int[][] product = new int[r1][c2];

        for(int i=0; i < r1; i++) {
            for(int j=0; j < c2; j++) {
                for(int k=0; k < c1; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Matrix Multiplication :");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}