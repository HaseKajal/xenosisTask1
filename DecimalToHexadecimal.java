//java program to convert decimal no to hexadecimal 
import java.util.Scanner;

public class DecimalToHexadecimal {

    // Method to convert decimal to hexadecimal
    public static String decimalToHexadecimal(int decimal) {
        // String to store hexadecimal result
        StringBuilder hexString = new StringBuilder();

        // Array of hexadecimal characters
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        // Loop until the decimal number is greater than 0
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexString.insert(0, hexChars[remainder]);
            decimal = decimal / 16;
        }

        // If the number is 0
        if (hexString.length() == 0) {
            hexString.append("0");
        }

        return hexString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert decimal to hexadecimal
        String hexadecimal = decimalToHexadecimal(decimal);

        System.out.println("Hexadecimal representation: " + hexadecimal);
    }
}