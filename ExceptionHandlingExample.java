
    import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fixedNumber = 10;

        System.out.println("Please enter a number:");

        try {
            int userInput = scanner.nextInt();
            int result = fixedNumber / userInput;
            System.out.println("The result of division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
            System.out.println("Cleanup completed. Program execution finished.");
        }
    }
}
