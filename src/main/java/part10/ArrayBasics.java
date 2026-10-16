package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        starts at 1:43:42 — stop at about 1:49:45, at "so that's what an array is"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 10 — arrays (many values in one variable)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayBasics.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ArrayBasics {
    public static void main(String[] args) {
        // what this line does is create a string array that holds mutliple values of types string
        String[] cars = {"Camaro", "Corvette", "Tesla"};
        // this line says that you are creating a string array called car and its going to have 3 string items in it
        String[] car = new String[3];
        /* this is a loop that will print out every item in the array one at a time
        it does this beccause we have a counter i that increase by 1 every step
        and cannot go above the length of car which is the amount of items
        and in this case 3
         */
        for (int i = 0; i < cars.length; i++) {
            // this line prints out cars at i index so when i is 1 it prints cars[1] which is Corvette
            System.out.println(cars[i]);
        }
    }

}
