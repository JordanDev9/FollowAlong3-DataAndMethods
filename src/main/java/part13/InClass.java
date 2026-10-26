package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        rewatch 2:27:54–2:39:30 for methods, parameters and return
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {
        int num = 10;
        int x = 7;
        int y = 3;
        int a = 12;
        int b = 30;
        String name1 = "Davis";
        String name2 = "Brooks";
        line(num);
        names(name1, name2);
        numbers(x, y, a, b );



        // STEP 1 — this code works, but it repeats itself.
        // Together, we break it into three methods: line(), greet(...) and add(...).
        // Run it FIRST and look at the output. When we are done, it must print
        // exactly the same thing.
//        System.out.println("----------");
//        System.out.println("Hello, Davis!");
//        System.out.println("----------");
//        System.out.println("Hello, Brooks!");
//        System.out.println("----------");
//        int total = 7 + 3;
//        System.out.println("Total yards: " + total);
//        int total2 = 12 + 30;
//        System.out.println("Total yards: " + total2);

        // STEP 2 — fix the bugs. Do this AFTER step 1, once your three methods exist.
        // Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        // this line i think is supposed to call a function and you need () FOR THAT and has not parameters
        //line(num);
        // greet was never defined and has not parameters
        //greet();
        // they expect variable like pre defined variables not actual int values so well use x and y
        // also add is not defined
        //String yards = add(x, y);

    }

    // Your new methods go here: after main's closing } and before the class's closing }.
       static void line(int num){
           for (int i = 0; i < num; i++) {
               System.out.print("-");
           }
           System.out.println();
       }
       static void names(String name1, String name2){
           System.out.println("Hello, " + name1 + "!");
           System.out.println("----------");
           System.out.println("Hello, " + name2 + "!");
           System.out.println("----------");
       }
       static void numbers(int x , int y, int a, int b){
           System.out.println("Total: " + (x + y));
           System.out.println("Total: " + (a + b));
       }

}
