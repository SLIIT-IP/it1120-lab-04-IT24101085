import java.util.Scanner;

public class IT24101085Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using the ternary operator to check if the number is positive, negative, or zero
        String result = (number > 0) ? "Positive" :
                        (number < 0) ? "Negative" : "Zero";

        // Display the result
        System.out.println("The number is: " + result);

        scanner.close();
    }
}
