package Alien_Temple;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String description;
    private List<Item> items;
    private boolean hasMonster;

    public Room(String description) {
        this.description = description;
        this.items = new ArrayList<>();
        this.hasMonster = false;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public void setHasMonster(boolean hasMonster) {
        this.hasMonster = hasMonster;
    }

    public void displayRoomDetails() {
        System.out.println(description);
        if (!items.isEmpty()) {
            System.out.println("You see the following items:");
            for (Item item : items) {
                System.out.println("- " + item.getItemName());
            }
        }

        if (hasMonster) {
            System.out.println("There is a monster here!");
        }
    }
}
