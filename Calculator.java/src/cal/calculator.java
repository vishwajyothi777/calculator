package cal;
import java.util.Scanner;
public class calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        calculator Calculator = new calculator();

        System.out.println("Sum: " + Calculator.sum(num1, num2));
        System.out.println("Subtract: " + Calculator.subtract(num1, num2));
        System.out.println("Multiply: " + Calculator.multiply(num1, num2));
        
        try {
            System.out.println("Divide: " + Calculator.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}

