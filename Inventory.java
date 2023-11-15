package Alien_Temple;

import java.util.ArrayList;

class Inventory
{
    ArrayList<Item> hotBar = new ArrayList<>();
    ArrayList<Item> extraStorage = new ArrayList<>();
}

/////////////////////////////////////////////////////////////

package Alien_Temple;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Item item : items) {
                item.printItemDetails();
            }
        }
    }
}
