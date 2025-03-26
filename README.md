# Calculator_java


## Description
This project is a simple calculator application implemented in Java. It includes:
  - Basic arithmetic operations (Addition, Subtraction, Multiplication, Division)
  - Fibonacci sequence calculation
  - Sum of array elements
  - Mean of array elements

The program is divided into three separate files:
  - ### Main.java :
     Contains the main method, displays the menu, and handles user interactions using switch-case statements.
  - ### UserInput.java :
     Manages user input methods for integers and arrays.
  - ### Calculator.java :
    Contains all the calculation methods.


## Features
- Basic Arithmetic Operations:
    - Addition, Subtraction, Multiplication, and Division.
    - Division includes exception handling for division by zero.
- Fibonacci Sequence:
    - Recursive function to generate Fibonacci numbers.
- Array Operations:
    - Sum of array elements.
    - Mean (average) of array elements.


## Files and Functions
### 1.Main.java
  - Contains the main method that:
       - Displays a menu with all available operations.
       - Uses switch-case for function selection.
       - Handles program execution and termination.

### 2.UserInput.java
  - getTwoNumbers(): Accepts two integer inputs from the user.
  - getArray(): Accepts an array of integers from the user.

### 3.Calculator.java
  - dd(int[] numbers): Adds two integers.
  - subtract(int[] numbers): Subtracts the second integer from the first.
  - multiply(int[] numbers): Multiplies two integers.
  - divide(int[] numbers): Divides the first integer by the second with error handling for division by zero.
  - fibonacci(int n): Generates the Fibonacci sequence using recursion.
  - sumArray(int[] array): Calculates the sum of all elements in an array.
  - meanArray(int[] array): Computes the mean of the array elements.


## How to Run the Program
- 1.Clone the repository:
    - git clone <
