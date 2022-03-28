# Rational Number Operations in Java

This repository contains a Java project that performs operations on rational numbers. The program includes classes for representing rational numbers, performing arithmetic operations, and handling user input to display the results.

## Features

- **Representation of Rational Numbers**: Defines a class for rational numbers, including numerator and denominator.
- **Arithmetic Operations**: Implements methods for addition, subtraction, multiplication, and division of rational numbers.
- **User Interaction**: Handles user input to create rational numbers and perform operations on them.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes the methods for rational number operations.

```java
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator of the first rational number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the denominator of the first rational number: ");
        int den1 = scanner.nextInt();

        System.out.print("Enter the numerator of the second rational number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the denominator of the second rational number: ");
        int den2 = scanner.nextInt();

        TRacional r1 = new TRacional(num1, den1);
        TRacional r2 = new TRacional(num2, den2);

        TOperaRacionales operations = new TOperaRacionales();

        TRacional sum = operations.add(r1, r2);
        TRacional difference = operations.subtract(r1, r2);
        TRacional product = operations.multiply(r1, r2);
        TRacional quotient = operations.divide(r1, r2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
```

#### Rational Number Class

The `TRacional` class represents a rational number and includes methods for simplifying the number.

```java
public class TRacional {
    private int numerator;
    private int denominator;

    public TRacional(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
```

#### Operations Class

The `TOperaRacionales` class contains methods for performing arithmetic operations on rational numbers.

```java
public class TOperaRacionales {

    public TRacional add(TRacional r1, TRacional r2) {
        int numerator = r1.getNumerator() * r2.getDenominator() + r2.getNumerator() * r1.getDenominator();
        int denominator = r1.getDenominator() * r2.getDenominator();
        return new TRacional(numerator, denominator);
    }

    public TRacional subtract(TRacional r1, TRacional r2) {
        int numerator = r1.getNumerator() * r2.getDenominator() - r2.getNumerator() * r1.getDenominator();
        int denominator = r1.getDenominator() * r2.getDenominator();
        return new TRacional(numerator, denominator);
    }

    public TRacional multiply(TRacional r1, TRacional r2) {
        int numerator = r1.getNumerator() * r2.getNumerator();
        int denominator = r1.getDenominator() * r2.getDenominator();
        return new TRacional(numerator, denominator);
    }

    public TRacional divide(TRacional r1, TRacional r2) {
        int numerator = r1.getNumerator() * r2.getDenominator();
        int denominator = r1.getDenominator() * r2.getNumerator();
        return new TRacional(numerator, denominator);
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Principal`) to start the program.
3.  Enter the numerators and denominators for two rational numbers when prompted.
4.  The program will calculate and display the sum, difference, product, and quotient of the rational numbers.

### Classes and Methods

-   `Principal`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `TRacional`: A class representing a rational number with methods for simplification.
    -   `TRacional(int numerator, int denominator)`: Constructor that initializes the rational number.
    -   `toString()`: Method that returns the string representation of the rational number.
-   `TOperaRacionales`: A class containing methods for arithmetic operations on rational numbers.
    -   `add(TRacional r1, TRacional r2)`: Method that returns the sum of two rational numbers.
    -   `subtract(TRacional r1, TRacional r2)`: Method that returns the difference between two rational numbers.
    -   `multiply(TRacional r1, TRacional r2)`: Method that returns the product of two rational numbers.
    -   `divide(TRacional r1, TRacional r2)`: Method that returns the quotient of two rational numbers.