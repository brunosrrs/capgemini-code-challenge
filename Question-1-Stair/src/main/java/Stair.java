import java.util.InputMismatchException;
import java.util.Scanner;

public class Stair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter an integer: ");
            int height = sc.nextInt();
            System.out.println("You entered " + height);
            buildinStairs(height);
        } catch (InputMismatchException e){
            System.out.println("You have entered invalid data");

        }

    }

    static void buildinStairs (int height){

        for (int simbols = 1; simbols <= height; simbols++){
            int spaces = height - simbols;

            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }

            for(int si = 0; si < simbols ; si++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}