package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7151s
//        rewatch 1:59:10–2:03:35 for charAt, toUpperCase and the other String methods
// Guide: GUIDE.md in this folder, steps 2–10
//
// SECTION D — Challenge. Two methods. The README explains each one.
// A test in src/test/java/part11/ChallengeTest.java checks your answers.
// Change ONLY the lines marked YOUR CODE. Do not change the test file.

public class Challenge {
    public static void main(String[] args) {
        System.out.println(initials("jordan", "smith"));
        System.out.println(initials("Ada", "Lovelace"));
        System.out.println(swapEnds("code"));
        System.out.println(swapEnds("a"));
    }

    // initials("jordan", "smith") should return "J.S."
    // initials("Ada", "Lovelace") should return "A.L."
    public static String initials(String first, String last) {
        String FI = first.toUpperCase().charAt(0) + ".";
        String LI = last.toUpperCase().charAt(0) + ".";
        String done = FI +LI;
        return done;
    }


    // swapEnds("code") should return "eodc"
    // swapEnds("a")    should return "a"    (shorter than 2 letters: give it back unchanged)
    public static String swapEnds(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int lastC = s.length() - 1;
        String mid = s.substring(1, s.length() - 1);
        return s.charAt(lastC) + mid + s.charAt(0);
    }
}
