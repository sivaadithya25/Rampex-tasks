
import java.util.Scanner;

public class Subwaygame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        int score = 0;
        System.out.println("Subway Surfers Game \n");
        do {
            System.out.println("Type Action:");
            System.out.println("jump");
            System.out.println("slide");
            System.out.println("left");
            System.out.println("right");
            System.out.println("coin");
            System.out.println("over");
            choice = sc.next().toLowerCase();
            switch (choice) {
                case "jump" :
                    score += 10;
                    System.out.println("Jumped! ");
                    break;

                case "slide":
                    score += 10;
                    System.out.println("Slid! ");
                    break;

                case "left" :
                    System.out.println("Moved Left");
                    break;
                case "right" :
                    System.out.println("Moved Right");
                    break;
                case "coin":
                    score += 20;
                    System.out.println("Coin Collected!");
                    break;
                case "over":
                    System.out.println("Game Over X \n" + "Final Score: " + score);
                    break;

                default :
                      System.out.println("Invalid Input!");
            }
        } while (!choice.equals("over"));
        sc.close();
    }
}