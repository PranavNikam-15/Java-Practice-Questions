// Task: Pattern: Pascal's Triangle up to N rows.

public class task_16 {
    public static void main(String[] args) {

        int n = 5;

        for(int i=0; i < n; i++) {
            
            for(int space = 0; space < n-i-1; space++) {
                System.out.print(" ");
            }

            int val = 1;

            for(int j=0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}