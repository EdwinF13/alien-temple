package Alien_Temple;

class Monster
{
    private String monsterSpecies;
    private String monsterDescription;
    private int monsterHp;
    private int monsterDamageOutput;

    public String getMonsterSpecies()
    {
        return monsterSpecies;
    }

    public String getMonsterDescription()
    {
        return monsterDescription;
    }

    public int getMonsterHp()
    {
        return monsterHp;
    }

    public int getMonsterDamageOutput()
    {
        return monsterDamageOutput;
    }

    public void printMonsterDetails()
    {
        System.out.println("Species: " + monsterSpecies);
        System.out.println("About: " + monsterDescription);
        System.out.println("HP: " + monsterHp);
        System.out.println("DMG Output: " + monsterDamageOutput);
    }
}

/////////////////////////////////////////////////////////////////////////////

package Alien_Temple;

public class Monster {
    private String species;
    private String description;
    private int health;
    private int damage;

    public Monster(String species, String description, int health, int damage) {
        this.species = species;
        this.description = description;
        this.health = health;
        this.damage = damage;
    }

    public String getSpecies() {
        return species;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Player player) {
        System.out.println("The " + species + " attacks!");
        player.decreaseHealth(damage);
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            System.out.println(species + " has been defeated!");
        }
    }

    public void displayMonsterDetails() {
        System.out.println("Encountered a " + species);
        System.out.println(description);
    }
}
