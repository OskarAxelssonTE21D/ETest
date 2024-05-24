import javax.management.StringValueExp;
import java.util.*;

public class Main {
    static int hitx;
    int hity;
    public static void main(String[] args) {
        int randomX = (int)(Math.random() * 9);
        int randomY = (int)(Math.random() * 9);

        int[][] board = new int[9][9];

        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of zombies
        System.out.println("Hur många SmallEnemy finns?");
        int numSmall = getValidInput(scanner);

        // Ask user for the number of dinosaurs
        System.out.println("Hur många LargeEnemy finns?");
        int numLarge = getValidInput(scanner);

        List<SmallEnemy> smallEnemy = new ArrayList<>();
        List<LargeEnemy> largeEnemy = new ArrayList<>();

        for (int i = 0; i < numSmall; i++) {
            Enemy.Enemy(new SmallEnemy());
        }

        // Instantiate and add dinosaurs to the list
        for (int i = 0; i < numLarge; i++) {
            Enemy.Enemy(new SmallEnemy());
        }

        int[][] smallenemy = new int[randomX][randomY];
        int[][] largeenemy = new int[randomX][randomY];

        System.out.println("\nsmallEnemies:" + randomX+","+randomY);
        //for (int[] SmallEnemy; smallEnemy(){
         //   System.out.println(smallEnemy);
     //   }
        // Print out the stats of the created dinosaurs
        System.out.println("\nLargeEnemies:"+ smallenemy);
        for (int[] largeEnemy1 : largeenemy) {
            System.out.println(largeEnemy1);
        }
        System.out.println(randomX);
        System.out.println(randomY);

        while (hitx == randomX){
            System.out.println("died");

            System.out.println("välj en x-kordinat");
            int hitx = getValidInput(scanner);

            System.out.println("Välj en y-kordinat");
            int hity = getValidInput(scanner);
        }
    }
    private static boolean smallEnemy() {
        return false;
    }

    private static int getValidInput(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                // Prompt user to enter a valid number if input is invalid
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}

