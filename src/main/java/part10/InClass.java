package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6222s
//        rewatch arrays (about 1:43:42) and 2D arrays (about 1:50:51)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we build the temperature log and the map together, here.
        System.out.println("=== TEMPERATURE LOG ===");
        int[] temp = new int[5];
        temp[0] = 70;
        temp[1] = 72;
        temp[2] = 68;
        temp[3] = 75;
        temp[4] = 71;
        int max = 0;
        for(int i = 0; i < temp.length; i++) {
            System.out.println("Reading " + i +": " + temp[i]);
            if(temp[i] > max){
                max = temp[i];
            }else{
                max = max;
            }
        }
        System.out.println("Highest: " + max);
        System.out.println("=== MAP ===");
        String[][] map =  new String[3][3];
        map[0][0] = "#";
        map[0][1] = ".";
        map[0][2] = "#";
        map[1][0] = ".";
        map[2][0] = "#";
        map[1][1] = "R";
        map[1][2] = ".";
        map[2][1] = ".";
        map[2][2] = "#";
        for(int j = 0; j < map.length;j++){
            System.out.println();
            for(int k = 0; k < map[j].length; k++){
                System.out.print(map[j][k]);
            }
        }



        // STEP 2 — fix the bugs. Each bug below is inside its own /* ... */.
        // Do ONE bug at a time: delete its /* line and its */ line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next bug.

        // they never gave a value for the index so they dont know how the expected amount of values in the array
        int[] readings = new int[3];


        // they dont need the () .length is good on its own
        int[] speeds = {3, 5, 4};
        System.out.println(speeds.length);


        /* 3 items mean it has  a index at 0, 1 and 2
        because it starts at zero there is not third index
        meaning [3] doesnt exist it needs to be 2
        orr we need to increase the index size
        */
        String[] names = new String[4];
        names[3] = "Ana";
        System.out.println(names[3]);
    }
}
