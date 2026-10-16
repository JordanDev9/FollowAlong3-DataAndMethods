package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7467s
//        starts at about 2:04:27 — stop at about 2:11:35, when he says "that's the basics of wrapper classes"
// Guide: GUIDE.md in this folder, steps 11–15
//
// Part 11 — wrapper classes
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WrapperClasses.
//    Leave the "package part11;" line and the "public class WrapperClasses" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class WrapperClasses {
    public static void main(String[] args) {
        /*
        These lines create objects but java can use them as types so we gave
        them values that match their types
         */
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";
        // this line proves that the objects can but used as their type
        if (a == true) {
            // this line was used to show the  condtition is true
            System.out.println("This is true");
        }
        // this line proves that the objects can but used as their type
        if (b == '@') {
            // this line was used to show the  condtition is true
            System.out.println("This is true");
        }
        //both of these lines were more ways to show that the objects could be used
        System.out.println(c + 1);
        System.out.println(d * 2);
    }

}
