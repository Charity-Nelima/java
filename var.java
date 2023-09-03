public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
int age = 30;             // Integer
double price = 19.99;     // Double
char grade = 'A';         // Character
boolean isJavaFun = true; // Boolean
String name = "John";     // String

// operators

int a = 10, b = 5;
int sum = a + b;     // Addition
int diff = a - b;    // Subtraction
int product = a * b; // Multiplication
int quotient = a / b; // Division
int remainder = a % b; // Modulus (remainder)

boolean isGreater = a > b; // Comparison (greater than)
boolean isEqual = a == b;  // Comparison (equal to)

// constructors
// if else
int x = 10;
if (x > 5) {
    System.out.println("x is greater than 5");
} else {
    System.out.println("x is not greater than 5");
}


// for, while, do while
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration " + i);
}

int count = 0;
while (count < 3) {
    System.out.println("Count: " + count);
    count++;
}

int num = 5;
do {
    System.out.println("Num: " + num);
    num--;
} while (num > 0);
