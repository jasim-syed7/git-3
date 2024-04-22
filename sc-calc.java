import java.util.Scanner;

public class ScientificCalculator {
    
    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Method to divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN; // NaN represents "Not a Number"
        }
        return a / b;
    }
    
    // Method to calculate square root of a number
    public static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Scientific Calculator!");
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Enter two numbers:");
                double addNum1 = scanner.nextDouble();
                double addNum2 = scanner.nextDouble();
                System.out.println("Result: " + add(addNum1, addNum2));
                break;
            case 2:
                System.out.println("Enter two numbers:");
                double subNum1 = scanner.nextDouble();
                double subNum2 = scanner.nextDouble();
                System.out.println("Result: " + subtract(subNum1, subNum2));
                break;
            case 3:
                System.out.println("Enter two numbers:");
                double mulNum1 = scanner.nextDouble();
                double mulNum2 = scanner.nextDouble();
                System.out.println("Result: " + multiply(mulNum1, mulNum2));
                break;
            case 4:
                System.out.println("Enter two numbers:");
                double divNum1 = scanner.nextDouble();
                double divNum2 = scanner.nextDouble();
                System.out.println("Result: " + divide(divNum1, divNum2));
                break;
            case 5:
                System.out.println("Enter a number:");
                double sqrtNum = scanner.nextDouble();
                System.out.println("Result: " + squareRoot(sqrtNum));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}
