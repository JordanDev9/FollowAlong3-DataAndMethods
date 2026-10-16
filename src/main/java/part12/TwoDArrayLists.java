package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8210s
//        starts at about 2:16:50 — stop at about 2:23:45, when he says "that's how two-dimensional ArrayLists work"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 12 — 2D ArrayList
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called TwoDArrayLists.
//    Leave the "package part12;" line and the "public class TwoDArrayLists" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
/*
all of the arraylist below take in string which is why all the list are strings
the only one that is differnt is the two d array list
it takes in a string but it also takes in another arraylist
 */
public class TwoDArrayLists {
    public static void main(String[] args) {
        // this line creates an arraylist called bakery list
        ArrayList<String> bakeryList = new ArrayList<String>();
        // the next 3 lines add something to the arraylist
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        // this line creates an arraylist called procduce list
        ArrayList<String> produceList = new ArrayList<String>();
        // the next 3 lines add something to the list
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");
        // this line creates an array list called drinkslist
        ArrayList<String> drinksList = new ArrayList<String>();
        // the two lines below add something to the list
        drinksList.add("soda");
        drinksList.add("coffee");
        // this line prints the entire array list bakerylist so whatever is inside of it will print
        System.out.println(bakeryList);
        // this line print the first and only the first item in bakery list
        System.out.println(bakeryList.get(0));
        // this line print the entire dirnkslsit
        System.out.println(drinksList);
        // this line creates an array this that takes in a array list and a string
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        // the next 3 lines are adding another arraylist to this one which is why we needed this list to be able to take in another one
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList);
        // this line print grocery list 0 which will print out the first array list that we added to it
        System.out.println(groceryList.get(0));
        // thiss line prints out the first item in the first array list the we adding so the first item in bakery list
        System.out.println(groceryList.get(0).get(0));
        // this line prints out the second item in the 3rd but in this case last array list that we gave it so it would print the second item in drinkslist
        System.out.println(groceryList.get(2).get(1));

    }

}
