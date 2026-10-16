package part11;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=7095s
//        starts at about 1:58:15 — stop at about 2:03:35, when he says "those are a few of the more useful String methods"
// Guide: GUIDE.md in this folder, steps 1–10
//
// Part 11 — String methods
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StringMethods.
//    Leave the "package part11;" line and the "public class StringMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class StringMethods {
    public static void main(String[] args){
        // this line assigns string value Bro to the variable name
        String name = "Bro";
        // this line creates a boolean and ask if name is equals to whats inside the quotes
        boolean equalsResult = name.equals("Bro");
        // this line prints the result of the boolean we created
        System.out.println(equalsResult);
        // this line ask if name is equal to Bro
        boolean lowerResult = name.equals("bro");
        // this line prints the result of the boolean lowerresult
        System.out.println(lowerResult);
        // this linb ask if name equals bro but is not case sensitive beacause of ignorecase
        boolean ignoreResult = name.equalsIgnoreCase("bro");
        // thie line prints the result of ignore result
        System.out.println(ignoreResult);
        // this line ask for the length of string name
        int lengthResult = name.length();
        // this line prints the length of string name
        System.out.println(lengthResult);
        // thsi line ask for the string value at index 0
        char charResult = name.charAt(0);
        // this line prints the string value at index 0
        System.out.println(charResult);
        // this line ask for the index of the string value o inside of string name
        int indexResult = name.indexOf("o");
        // this line prints the index of the string value o inside of string name
        System.out.println(indexResult);
        // this line ask if string name is empty and is a booleahn
        boolean emptyResult = name.isEmpty();
        // this line prints the result of isemtpy
        System.out.println(emptyResult);
        // this line makes string name all uppercase
        String upperResult = name.toUpperCase();
        // this line prints string name as all uppercase
        System.out.println(upperResult);
        // this line makes string name all lowercase
        String lowerCaseResult = name.toLowerCase();
        // this line prints string name as all lowercase
        System.out.println(lowerCaseResult);
        // this line prints bro with extra spaces around it
        String spaced = "   Bro   ";
        // this line takes that strinng spaced and removes the spaces just leaving bro
        String trimResult = spaced.trim();
        // this line prints  [   bro   ]
        System.out.println("[" + spaced + "]");
        // this line print [bro] because we trimmed it
        System.out.println("[" + trimResult + "]");
        // this line replaces a certain string inside of name and changes it to something else
        String replaceResult = name.replace('o', 'a');
        // this line prints the result of changing a certain string inside of string name
        System.out.println(replaceResult);


        }
}
