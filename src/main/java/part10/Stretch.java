package part10;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=6233s
//        rewatch 1:43:53 (arrays), 1:48:37 (looping through an array), 1:53:36 (2D loops)
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
/* this code will print 8 4 17 16 15 8 17 or 4 idk then 4 2 rows 3 collums
 */
public class Stretch {
    public static void main(String[] args) {
        int[] nums = {4, 8, 15, 16};
        System.out.println(nums[1]);
        System.out.println(nums.length);
        nums[0] = nums[3] + 1;
        System.out.println(nums[0]);
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(grid[1][0]);
        System.out.println(grid.length + " rows, " + grid[0].length + " columns");
        String[] foods = {"pizza", "taco", "wings"};
        for(int i = 0; i < foods.length; i++){
            System.out.println("I like " + foods[i]);

        }
        double res = 0;
        int[] s = {88, 92, 75, 100, 64};
        for(int j = 0; j < s.length; j++){
            res += s[j];
        }
        double ave = (res / s.length);
        System.out.println("Total: " + (int)res);
        System.out.println("Average: " + ave);

        String[][] seats = {
                {"Ana", "Ben", "Cal"},
                {"Dee", "Eli", "Fay"}
        };
        for(int  l = 0; l < seats.length; l++){
            System.out.println();
            System.out.print("Row " + (l+1) + ":\t");
            for(int n = 0; n < seats[l].length; n++){
                System.out.print(seats[l][n] + "\t");
            }
        }

    }


}
