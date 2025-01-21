//Name : Pankaj Yadav
//PRN : 23070126166
//Batch : (2023-2027)

public class Calculator {
    // Basic arithmetic operations
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    
    // Fibonacci sequence up to n terms
    public int[] fibonacci(int n) {
        int[] fib = new int[n];
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }
    
    // Calculate mean of array
    public double mean(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    // Calculate mode of array
    public double mode(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        double maxValue = 0;
        int maxCount = 0;
        
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}