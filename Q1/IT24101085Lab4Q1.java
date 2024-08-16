import java.util.Scanner;

public class IT24101085Lab4Q1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        // Enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Determine if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
        
     
        scanner.close();
    }
}
