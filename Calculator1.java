import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, result;
        char operator;

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        // Read user input
         // creating a scanner object

        num1 = input.nextInt(); // Read an integer from user
        System.out.print("Enter an operator ('+','-','*','/'): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextInt();



        // Perform operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        input.close();
    }
}

