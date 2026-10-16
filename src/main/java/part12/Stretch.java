package part12;
import java.util.ArrayList;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7922s
//        rewatch 2:12:00–2:16:20 for ArrayList, 2:16:50–2:23:45 for 2D ArrayList,
//        2:23:57–2:27:20 for the for-each loop
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet, and no import. Typing both is part of the stretch.
/*
this code will print yellow blue 2 yellow yellow blue

 */
public class Stretch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.set(1, "yellow");
        colors.remove(0);
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(0));
        for (String c : colors) {
            System.out.print(c + " ");
        }
        System.out.println();
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(90);
        scores.add(75);
        scores.add(88);
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        System.out.println("Total: " + sum);
        ArrayList<String> Playlist = new ArrayList<String>();
        Playlist.add("song a");
        Playlist.add("song b");
        Playlist.add("song c");
        Playlist.add("song d");
        for(int i = 0; i < Playlist.size(); i++){
            System.out.println(i+1 + ". " + Playlist.get(i) );
        }
        Playlist.remove(2);
        System.out.println("Songs Left: " + Playlist.size());
        System.out.println(Playlist);

        ArrayList<String> row1 = new ArrayList<String>();
        ArrayList<String> row2 = new ArrayList<String>();
        row1.add("Ana");
        row1.add("Ben");
        row2.add("Cam");
        row2.add("Dee");
        row2.add("Eli");
        ArrayList<ArrayList<String>> Seats = new ArrayList<>();
        Seats.add(row1);
        Seats.add(row2);
        int row = 1;
        for(ArrayList<String> i : Seats){
            System.out.println("Row " + row + ": " + i);
            row++;
        }

    }

}
