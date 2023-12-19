import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class App2 {
    /**
     * Challenge 2: User Input
     * ---
     * Variables:
     * String name
     * Integer damage
     * Integer hp
     * 
     * Task:
     * Read all variable values from User Input.
     * If the damage is greater than or equal to hp, print that the user has died.
     * If the damage is less than hp, print that user survived.
     * 
     * Bonus 1:
     * Create a new double variable critChance.
     * 1. The user enters a decimal number between 0 and 1.
     * 2. Use Math.random to generate a random number between 0 and 1.
     * 3. If the number generated is greater than user input, then the damage
     * doubles.
     * 4. Otherwise, a regular attack ocurred.
     * 
     * Bonus 2:
     * Iterate infinitely Until a User Quits (types "done")
     * 
     */
    public static void main(String[] args) {

        String name = "Bob Ross";
        int damage = 10;
        int hp = 20;

        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        damage = input.nextInt();
        hp = input.nextInt();
        double critChance = input.nextDouble();

        if(critChance <= Math.random()) {
            damage *= 2;
        }

        if(damage >= hp){
            System.out.println(name + " has died!");
        } else {
            System.out.println(name + " survived!");
        }

        input.close();
    }
}
