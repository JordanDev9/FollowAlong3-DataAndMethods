package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6651s
//        starts at 1:50:51 — stop at about 1:57:41, at "so that is the basics of 2D arrays"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 10 — 2D arrays (an array of arrays: rows and columns)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrays.
//    Leave the "package part10;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class TwoDArrays {
    public static void main(String[] args) {
        // like before this line creates a string array but this time it says it has 3 rows and 3 collums meaning  9 items
        String[][] cars = new String[3][3];
        /*
        the first index is the row that it is in leaving the second index to be the collum
        0 is the start so 0 0 would be the very first item and in this case 2 2 would be the last
        all im doing is setting the value for every index in this array that i created call cars
         */
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        /* this line is a loop the has a counter i which equals 0 cannot go >= cars length which is 9
        and has a step value of 1 so i is just going to keep adding to itself
         */
        for (int i = 0; i < cars.length; i++) {
            // this line prints a new line becuase everytime we come back to this loop we want a new line for the next row or items
            System.out.println();
            /* this line is also a loop that has a counter j that goes up by 1 and
            cannot be greateer or equal to cars[i]  length which is how many items in i row
            which in this case will always be 3
             */
            for (int j = 0; j < cars[i].length; j++) {
                // this line prints out the cars at the index values or whatever i and j are at
                // for example during the first  run i will be 0 and j will be 0 so it prints the first item
                // during the second iteration i will still be 0 but j will be 1 printing cars[0][1]
                System.out.print(cars[i][j] + " ");
            }
        }
    }

}
