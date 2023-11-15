package Alien_Temple;

class Researcher
{
    private String causeOfDeath;
    private Item possessedItem;

    public String getCauseOfDeath()
    {
        return causeOfDeath;
    }

    public Item getPossessedItem()
    {
        return possessedItem;
    }

    public void setCauseOfDeath(String causeOfDeath)
    {
        this.causeOfDeath = causeOfDeath;
    }

    public void getPossessedIten(Item possessedItem)
    {
        this.possessedItem = possessedItem;
    }

    public Researcher(String causeOfDeath, Item possessedItem)
    {
        this.causeOfDeath = causeOfDeath;
        this.possessedItem = possessedItem;
    }
}

////////////////////////////////////////////////////////////////////////

package Alien_Temple;

public class Researcher {
    private String name;
    private int health;
    private Inventory inventory;
    private Room currentRoom;

    public Researcher(String name, int initialHealth) {
        this.name = name;
        this.health = initialHealth;
        this.inventory = new Inventory();
    }

    public void enterRoom(Room room) {
        this.currentRoom = room;
        room.displayRoomDetails();
    }

    public void pickUpItem(Item item) {
        inventory.addItem(item);
        System.out.println(item.getItemName() + " has been added to your inventory.");
    }

    public void useItem(Item item) {
        // Logic for using an item. This might affect the player, the room, or a monster.
        // Example: if(item.getName().equals("Health Potion")) { increaseHealth(20); }
    }

    public void attackMonster(Monster monster) {
        // Logic for attacking a monster. This might require weapon or item checks.
        System.out.println("You attack the " + monster.getSpecies() + ".");
        monster.takeDamage(/* weaponDamage or fixed value */);
        // Check if the monster is defeated
    }

    public void decreaseHealth(int amount) {
        health -= amount;
        if (health <= 0) {
            System.out.println("You have been defeated!");
            // Handle game over scenario
        }
    }

    public void increaseHealth(int amount) {
        health += amount;
    }

    public Inventory getInventory() {
        return inventory;
    }

    // Additional methods as needed (e.g., check status, display inventory)
}
