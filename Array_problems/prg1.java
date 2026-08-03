import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read matrix dimensions
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // 2. Initialize matrix
        int[][] arr = new int[r][c];

        // 3. Read elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 4. Transpose
        int[][] transpose = MatrixTranspose(arr);

        // 5. Print transposed matrix
        System.out.println("\nTransposed Matrix:");
        for (int[] row : transpose) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    static int[][] MatrixTranspose(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        // Transposed matrix gets dimensions swapped
        int[][] dum = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dum[j][i] = array[i][j];
            }
        }
        return dum;
    }
}