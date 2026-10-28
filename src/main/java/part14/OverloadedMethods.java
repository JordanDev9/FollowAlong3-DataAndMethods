package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        starts at about 2:40:18 — stop at about 2:45:29, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 14, video 1 — overloaded methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedMethods.
//    Leave the "package part14;" line and the "public class OverloadedMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class OverloadedMethods {
    public static void main(String[] args) {
        // Call the add method with 2 ints and store the result in x
        int x = add(1, 2);

// Print x
        System.out.println(x);

// Call the add method with 3 ints and store the result in y
        int y = add(1, 2, 3);

// Print y
        System.out.println(y);

// Call the add method with 4 ints and store the result in z
        int z = add(1, 2, 3, 4);

// Print z
        System.out.println(z);

// Call the add method with 4 doubles and store the result in d
        double d = add(1.0, 2.0, 3.0, 4.0);

// Print d
        System.out.println(d);
    }

    // Method that adds 2 ints
    static int add(int a, int b) {

// Show which overloaded method is being used
        System.out.println("This is overloaded method #1");

// Return the sum
        return a + b;
    }

    // Method that adds 3 ints
    static int add(int a, int b, int c) {

// Show which overloaded method is being used
        System.out.println("This is overloaded method #2");

// Return the sum
        return a + b + c;
    }

    // Method that adds 4 ints
    static int add(int a, int b, int c, int d) {

// Show which overloaded method is being used
        System.out.println("This is overloaded method #3");

// Return the sum
        return a + b + c + d;
    }

    // Method that adds 2 doubles
    static double add(double a, double b) {

// Show which overloaded method is being used
        System.out.println("This is overloaded method #4");

// Return the sum
        return a + b;
    }

    // Method that adds 3 doubles
    static double add(double a, double b, double c) {

// Show which overloaded method is being used
        System.out.println("This is overloaded method #5");

// Return the sum
        return a + b + c;
    }

    // Method that adds 4 doubles
    static double add(double a, double b, double c, double d) {

// Show which overloaded method is being used
        System.out.println("This is overloaded method #6");

// Return the sum
        return a + b + c + d;
    }
}
