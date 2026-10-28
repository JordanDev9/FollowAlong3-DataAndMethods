package part14;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=9618s
//        rewatch 2:40:18 for overloading, and 2:45:54 for printf
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {

    // STEP 1a — we type the two average methods together, here (outside main).
    static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }


    public static void main(String[] args) {

        // STEP 1b — we print the scoreboard together, here.
        System.out.printf("%-8s%8s\n", "Player", "Average");

        System.out.printf("%-8s%8.1f\n", "Davis",
                average(12, 15));

        System.out.printf("%-8s%8.1f\n", "Brooks",
                average(9, 14, 22));

        System.out.printf("%-8s%8.1f\n", "Lee",
                average(20, 7));


        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the error. Fix it. Run it. Then do the next line.
        // they never call the function nor to they give a name nor do they give atleast 2 inpputs
        //System.out.printf("%d points\n", 7.5);
        // the function does not take in 4 numbers
        //System.out.printf("%.1f\n", average(1, 2, 3,));
        // there nothing tells %d what to do
        //System.out.printf("%s scored %d\n", "Davis");

    }
}
