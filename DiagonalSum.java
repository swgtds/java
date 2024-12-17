import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i]; // Primary diagonal
            diagonalSum += matrix[i][n - i - 1]; // Secondary diagonal
        }
        
        // If the matrix has an odd size, subtract the center element as it's counted twice
        if (n % 2 != 0) {
            diagonalSum -= matrix[n / 2][n / 2];
        }

        System.out.println("Sum of both diagonals: " + diagonalSum);
        sc.close();
    }
}
