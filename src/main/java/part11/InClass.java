package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        rewatch 1:58:15–2:03:35 for the String methods, and the wrapper video after it
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we clean up a messy name together, here.
        String name = "   jordan Smith   ";
        String trimPN ="[" + name.trim() + "]";
        String trimN = name.trim();
        name = trimN;
        String shout = name.toUpperCase();
        char firstL = name.charAt(0);
        int space = name.indexOf(" ");
        String rep = name.replace(" ", "_");
        boolean isj = name.equalsIgnoreCase("Jordan Smith");
        boolean isJ = name.equalsIgnoreCase("JORDAN SMITH");
        int dubs = name.length();
        int dub = dubs * 2;
        System.out.println(trimN);
        System.out.println(shout);
        System.out.println(firstL);
        System.out.println(space);
        System.out.println(rep);
        System.out.println(isj);
        System.out.println(isJ);
        System.out.println(dub);









        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        // length need () at the end
        int size = "Sting".length();
        // i think you have to create the string first then call intial.char at 0
        // orr instead of the start being string it should be char
        // the next 3 lines are examples of how to do this 2 examples
        String initial = "Sting";
        char x = initial.charAt(0);
        char intialy = "Sting".charAt(0);


        // the c in Case should be capital shout is also already defined
        String shoutt = "Sting".toUpperCase();

    }
}
