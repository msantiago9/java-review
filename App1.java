public class App1 {
    /**
     * Challenge 1: Hello, World!
     * ---
     * Variables:
     * String name
     * Integer attack
     * Integer defense
     * Integer damage
     * Double health
     * 
     * Task:
     * Calculate the difference between attack and defense. (damage)
     * Subtract the damage from HP.
     * Print "{name} lost {damage} HP."
     * 
     * BONUS 1:
     * Also print "{Current HP} / {Total HP}" to show the user how much HP is left.
     * 
     * BONUS 2:
     * What if damage was a double, but health was an int?
     */
    public static void main(String[] args) {
        String name = "Hello World";
        int attack = 10;
        int defense = 5;
        int damage = attack - defense;
        double health = 100;
        double newHealth = health - damage;

        System.out.printf("%s lost %f HP.\n", name, damage);
        System.out.printf("%f / %f", newHealth, health);
    }
}
