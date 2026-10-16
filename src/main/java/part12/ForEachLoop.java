package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8637s
//        starts at about 2:23:57 — stop at about 2:27:20, when he says "that is everything you need to know to get started with the for-each loop"
// Guide: GUIDE.md in this folder, steps 11–13
//
// Part 12 — the for-each loop
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForEachLoop.
//    Leave the "package part12;" line and the "public class ForEachLoop" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ForEachLoop {
    public static void main(String[] args) {
        // this line creates a Array the has four items
        String[] animals = {"cat", "dog", "rat", "bird"};
        // this line creates a loop that says for String which we call i, in : mean in animal and then
        for (String i : animals) {
            // we print i for each String in animal
            System.out.println(i);
        }
        // this line creates an ArrayList called animalList
        ArrayList<String> animalList = new ArrayList<String>();
        // the next four lines add something to the arraylist
        animalList.add("cat");
        animalList.add("dog");
        animalList.add("rat");
        animalList.add("bird");
        // this line is a loop that does the same thing as the other prints out everything in the list one at a time
        for (String i : animalList) {
            System.out.println(i);

        }
    }

}
