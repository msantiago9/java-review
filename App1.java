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

        String name = "Lance";
        int attack = 23;
        int defense = 3;
        int damage = attack - defense;
        int hp = 20;
        if (damage < 0) {
            damage = 0;
        }
        int currentHp = hp - damage;
        System.out.println(name + " lost " + damage + " HP and is now " + currentHp + " HP");


        double a = 3.14159;
        int b = (int)(a);
        System.out.println(b);

        int c = 5;
        double d = c;
        System.out.println(d);
    }
}
