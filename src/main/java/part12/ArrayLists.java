package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        starts at about 2:12:02 — stop at about 2:16:20, when he says "that is ArrayLists in Java"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 12 — ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayLists.
//    Leave the "package part12;" line and the "public class ArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ArrayLists {
    public static void main(String[] args) {
        // this line creates a arraylist callde food that takes in a string
        ArrayList<String> food = new ArrayList<String>();
        // the next 3 lines adds to the arraylist
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        // this line is a loop with a counter i that stays under the arraylist foods size
        // which is done by doing food.size() and i increments by 1
        for(int i = 0; i < food.size(); i++){
            // this line prints out food size at index i by doing .get() which is how you do index with arraylist
            System.out.println(food.get(i));

        }
        // this line sets the index of 0 inside of food to sushi
        food.set(0, "sushi");
        // this line prints out the arraylist food so we can see the changes we made
        System.out.println(food);
        // this line removes the seccond index from food
        food.remove(2);
        // this line again prints it out so we can see the changes
        System.out.println(food);
        // this line clears the entire array list
        food.clear();
        // this line prints out the list so we can see the changes
        System.out.println(food);

    }

}
