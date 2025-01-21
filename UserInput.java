import java.util.Scanner;
//Name : Pankaj Yadav
//PRN : 23070126166
//Batch : (2023-2027)


public class UserInput {
    private Scanner scanner;
    
    public UserInput() {
        scanner = new Scanner(System.in);
    }
    
    public double getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }
    
    public double[] getArray() {
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        return array;
    }
    
    public int getOperation() {
        System.out.println("\nSelect operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Mean of Array");
        System.out.println("7. Mode of Array");
        System.out.println("8. Exit");
        
        System.out.print("Enter your choice (1-8): ");
        return scanner.nextInt();
    }
    
    public void close() {
        scanner.close();
    }
}