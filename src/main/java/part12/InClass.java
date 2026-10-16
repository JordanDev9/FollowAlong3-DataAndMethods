package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:02–2:27:20 for ArrayList, 2D ArrayList and the for-each loop
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

import java.util.ArrayList;

public class InClass {
    public static void main(String[] args) {
        // STEP 1 — we build a team roster together, here.
        ArrayList<String> Roster = new ArrayList<String>();
        Roster.add("Davis");
        Roster.add("Brooks");
        Roster.add("Lee");
        Roster.add("Kim");
        System.out.println(Roster);
        System.out.println("Size: " + Roster.size());
        System.out.println("First: " + Roster.get(0));
        System.out.println("Last: " + Roster.get(Roster.size()-1));
        System.out.println("After Set:  " + Roster.set(2, "Lopez"));
        System.out.println("After Remove: " + Roster.remove(1));
        System.out.println("Players: ");
        for(String i : Roster){
            System.out.println("- " + i);
        }
        ArrayList<String> O = new ArrayList<String>();
        ArrayList<String> D = new ArrayList<String>();
        O.add("Davis");
        O.add("lopez");
        D.add("Kim");
        D.add("Ortiz");
        ArrayList<ArrayList<String>> Team = new ArrayList<>();
        Team.add(O);
        Team.add(D);
        System.out.println("Team: " + Team);
        System.out.println("Defensive Captain: " + Team.get(1).get(0));



        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        // must replace int with integer
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // forgot the ()after new ArrayList<String>
        ArrayList<String> words = new ArrayList<String>();
        // roster needs a capital R and also length cannot be used for Arraylist only .sizee()
        System.out.println(Roster.size());

    }
}
