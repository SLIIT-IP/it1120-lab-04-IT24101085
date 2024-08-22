import java.util.Scanner;

public class IT24101085Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input exam marks
        System.out.print("Enter the exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        while (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input. Marks should be between 0 and 100.");
            System.out.print("Enter the exam marks (out of 100): ");
            examMarks = scanner.nextDouble();
        }

        // Input lab submission marks
        System.out.print("Enter the lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        while (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input. Marks should be between 0 and 100.");
            System.out.print("Enter the lab submission marks (out of 100): ");
            labMarks = scanner.nextDouble();
        }

        // Input exam percentage
        System.out.print("Enter the percentage for the exam marks: ");
        double examPercentage = scanner.nextDouble();

        // Input lab percentage
        System.out.print("Enter the percentage for the lab submission marks: ");
        double labPercentage = scanner.nextDouble();

        // Validate the percentage totals
        while (examPercentage + labPercentage != 100) {
            System.out.println("Invalid input. The percentages should add up to 100.");
            System.out.print("Enter the percentage for the exam marks: ");
            examPercentage = scanner.nextDouble();
            System.out.print("Enter the percentage for the lab submission marks: ");
            labPercentage = scanner.nextDouble();
        }

        // Calculate the final marks
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // printing final marks
        System.out.println("The final mark is: " + finalMark);
        
        scanner.close();
    }
}
