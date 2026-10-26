package part13;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8874s
//        starts at about 2:27:54 — stop at about 2:39:30, when he says "those are methods"
// Guide: GUIDE.md in this folder, steps 1–11
//
// Part 13 — methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Methods.
//    Leave the "package part13;" line and the "public class Methods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Methods {
        public static void main(String[] args) {
            // this line assigns string bro to the variable name
            String name = "Bro";
            // this line sets the variable age to the int value of 21
            int age = 21;
            // this line calls the function hello and takes in the parameters name and age and it does it 3 times
            hello(name, age);
            hello(name, age);
            hello(name, age);
            hello(name, age);
            // this line sets the varibale x to the int value of 3
            int x = 3;
            // this line sets the variable y to the int value of 4
            int y = 4;
            // this line sets the variable z to call the function add(x, y)
            int z = add(x, y);
            // this line prints z which is pre defined above
            System.out.println(z);
        }

        // this line creates a method called hello that has 2 parameters name and age
        static void hello(String name,int  age){
            // this line prints hello plus the parameter name which would be predefined
        System.out.println("Hello " + name);
        // this line prints you are and the parameter age which would be predefined
        System.out.println("You are " + age);
    }
    // this line creates a method called add that takes in the parameters x and y
    static int add(int x, int y) {
            // this line says the z is equal to the sum of x and y adding them together
        int z = x + y;
        // this line returns z so that whenever this function is called the output is whatever 7 is
        return z;
    }

}
