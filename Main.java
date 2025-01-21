//Name : Pankaj Yadav
//PRN : 23070126166
//Batch : (2023-2027)

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput input = new UserInput();
        
        while (true) {
            int choice = input.getOperation();
            
            switch (choice) {
                case 1: // Addition
                    double num1 = input.getNumber("Enter first number: ");
                    double num2 = input.getNumber("Enter second number: ");
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                    
                case 2: // Subtraction
                    num1 = input.getNumber("Enter first number: ");
                    num2 = input.getNumber("Enter second number: ");
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                    
                case 3: // Multiplication
                    num1 = input.getNumber("Enter first number: ");
                    num2 = input.getNumber("Enter second number: ");
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                    
                case 4: // Division
                    num1 = input.getNumber("Enter first number: ");
                    num2 = input.getNumber("Enter second number: ");
                    try {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 5: // Fibonacci
                    int terms = (int) input.getNumber("Enter number of terms: ");
                    int[] fib = calculator.fibonacci(terms);
                    System.out.print("Fibonacci sequence: ");
                    for (int num : fib) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                    
                case 6: // Mean
                    double[] array = input.getArray();
                    try {
                        System.out.println("Mean: " + calculator.mean(array));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 7: // Mode
                    array = input.getArray();
                    try {
                        System.out.println("Mode: " + calculator.mode(array));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 8: // Exit
                    input.close();
                    System.out.println("Thank you for using the calculator!");
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please select a number between 1 and 8.");
            }
        }
    }
}