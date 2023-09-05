// functions/methods

public int add(int x, int y) {
    return x + y;
}

public static void main(String[] args) {
    int result = add(3, 4);
    System.out.println("Result: " + result);
}

// more examples of functions in java

public class FunctionExample {

    // Define a function (method) named "add" that takes two parameters
    public static int add(int a, int b) {
        return a + b; // This method returns the sum of the two parameters
    }

    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Call the "add" method and store the result in a variable
        int result = add(5, 3);

        // Display the result to the console
        System.out.println("The result of adding 5 and 3 is: " + result);
    }
}
