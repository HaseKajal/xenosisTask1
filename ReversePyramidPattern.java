import java.util.Scanner;


public class ReversePyramidPattern {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();

        // Loop through each row
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            // Print numbers in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

