Calculator and Fibonacci Program
Author Details
Name: Pankaj Yadav
PRN: 23070126166
Batch: (2023–2027)
Project Overview
This Java-based Calculator and Fibonacci program demonstrates modular programming by organizing functionality into multiple classes. It offers a user-friendly interface to perform basic arithmetic operations, Fibonacci sequence generation, and array-based calculations such as mean and mode.

The program adheres to coding standards, is well-documented, and uses comments to explain key blocks of logic for better readability and maintainability.

Features
1. Basic Arithmetic Operations
Addition
Subtraction
Multiplication
Division (with error handling for division by zero)
2. Fibonacci Sequence
Generates the Fibonacci sequence up to the user-specified number of terms.
3. Array Calculations
Mean: Calculates the average of an array.
Mode: Identifies the most frequently occurring element in an array.
4. User-Friendly Input Handling
Accepts both single numbers and arrays as input.
Provides a menu-driven system for selecting operations using switch-case.
5. Error Handling
Handles invalid inputs for numerical values and arrays.
Prevents division by zero and handles empty arrays gracefully.
File Structure
1. Main.java
The entry point of the program.
Manages the program’s execution flow.
Invokes methods from the Calculator and UserInput classes.
Contains program metadata (Name, PRN, Batch).
2. Calculator.java
Implements all mathematical operations:
Arithmetic Operations: add, subtract, multiply, divide
Fibonacci Sequence: fibonacci
Array Calculations: mean, mode
3. UserInput.java
Provides methods to:
Input single numbers and arrays.
Select operations through a menu-driven system.
Contains utility functions for error-free user input.
How to Run the Program
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/Calculator-and-Fibonacci.git
Navigate to the project folder:

bash
Copy
Edit
cd Calculator-and-Fibonacci
Compile the Java files:

bash
Copy
Edit
javac Main.java UserInput.java Calculator.java
Run the program:

bash
Copy
Edit
java Main
Usage Instructions
Launch the program.
Select an operation from the menu:
1 for Addition
2 for Subtraction
3 for Multiplication
4 for Division
5 for Fibonacci Sequence
6 for Mean of an Array
7 for Mode of an Array
8 to Exit
Follow the prompts to input numbers or arrays as needed.
View the result and continue with another operation or exit.
Sample Menu
mathematica
Copy
Edit
Select operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Fibonacci Sequence
6. Mean of Array
7. Mode of Array
8. Exit
Enter your choice (1-8):
Program Design
Code Highlights:
Modular Design: The code is split into logical classes (Main, Calculator, UserInput) for better organization.
Error Handling: Graceful handling of invalid inputs and edge cases (e.g., division by zero, empty arrays).
Documentation: Comprehensive comments for key blocks of logic.
Dynamic Input Handling: Supports both single numbers and arrays.
Sample Output:
Example 1: Addition
sql
Copy
Edit
Enter first number: 5
Enter second number: 3
Result: 8.0
Example 2: Fibonacci Sequence
mathematica
Copy
Edit
Enter number of terms: 5
Fibonacci sequence: 0 1 1 2 3
Example 3: Mean of Array
mathematica
Copy
Edit
Enter the size of array: 4
Enter element 1: 5
Enter element 2: 10
Enter element 3: 15
Enter element 4: 20
Mean: 12.5
Example 4: Mode of Array
mathematica
Copy
Edit
Enter the size of array: 5
Enter element 1: 1
Enter element 2: 2
Enter element 3: 3
Enter element 4: 2
Enter element 5: 2
Mode: 2.0
GitHub Repository
The repository includes:

Source Files: Main.java, Calculator.java, UserInput.java
README.md: Provides a detailed overview of the project.
Multiple Commits:
Initial setup and individual method implementations.
Final version with code comments and cleanup.
