package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9954s
//        starts at about 2:45:54 — stop at about 2:56:50, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 14, video 2 — the printf method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Printf.
//    Leave the "package part14;" line and the "public class Printf" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Printf {
    public static void main(String[] args) {
        // Create a boolean variable and store true
        boolean myBoolean = true;

// Create a char variable and store '@'
        char myChar = '@';

// Create a String variable and store "Bro"
        String myString = "Bro";

// Create an int variable and store 50
        int myInt = 50;

// Create a double variable and store 1000
        double myDouble = 1000;

// Print a boolean using %b
        System.out.printf("%b\n", myBoolean);

// Print a character using %c
        System.out.printf("%c\n", myChar);

// Print a String using %s
        System.out.printf("%s\n", myString);

// Print an integer using %d
        System.out.printf("%d\n", myInt);

// Print a double using %f
        System.out.printf("%f\n", myDouble);

// Print the String right-aligned in a field 10 spaces wide
        System.out.printf("Hello %10s\n", myString);

// Print the String left-aligned in a field 10 spaces wide
        System.out.printf("Hello %-10s!\n", myString);

// Print the double with 6 decimal places (default)
        System.out.printf("You have this much money %f\n", myDouble);

// Print the double with 2 decimal places
        System.out.printf("You have this much money %.2f\n", myDouble);

// Print the double with 1 decimal place
        System.out.printf("You have this much money %.1f\n", myDouble);

// Print the double left-aligned in a field 20 spaces wide
        System.out.printf("You have this much money %-20f!\n", myDouble);

// Print the double right-aligned in a field 20 spaces wide
        System.out.printf("You have this much money %20f!\n", myDouble);

// Always show the sign (+ or -)
        System.out.printf("You have this much money %+f\n", myDouble);

// Show the sign for a negative number
        System.out.printf("You have this much money %+f\n", -myDouble);

// Fill empty spaces with zeros up to 20 characters wide
        System.out.printf("You have this much money %020f\n", myDouble);

// Add commas as thousands separators
        System.out.printf("You have this much money %,f\n", myDouble);

    }
}
