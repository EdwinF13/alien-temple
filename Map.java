package Alien_Temple;

import java.util.Random;

class Node
{
    int value;
    Node left;
    Node right;

    Node(int value)
    {
        this.value = value;
        right = null;
        left = null;
    }
}

public class Map
{
    Node root;

    private Node addRecursive(Node current, int value)
    {
        if(current == null)
        {
            return new Node(value);
        }

        if(value < current.value)
        {
            current.left = addRecursive(current.left, value);
        }
        else if(value > current.value)
        {
            current.right = addRecursive(current.right, value);
        }
        else
        {
            return current;
        }

        return current;
    }

    public void add(int value)
    {
        root = addRecursive(root, value);
    }    

    public Map createMap()
    {
        Map bt = new Map();
        Random roomGen = new Random();
        int maxRooms = 10;
        for(int i = 0; i < maxRooms; i++)
        {
            bt.add(roomGen.nextInt(maxRooms));
        }
        return bt;
    }
}

///////////////////////////////////////////////////////////////////

package Alien_Temple;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<Room> rooms;
    private Researcher player; // Assuming Researcher is the player class

    public Map(Researcher player) {
        this.rooms = new ArrayList<>();
        this.player = player;
        createMap(); // Initialize the map
    }

    private void createMap() {
        // Create 10 rooms with unique descriptions and contents
        rooms.add(new Room("Entrance Hall", "A grand, dimly lit entrance hall. Dust covers the ancient alien artifacts."));
        rooms.add(new Room("Observation Chamber", "Numerous screens and devices, long since powered down. A broken datapad lies on the floor."));
        rooms.add(new Room("Research Lab", "Abandoned research equipment is scattered throughout. Papers and notes are strewn about."));
        rooms.add(new Room("Residential Quarters", "Living quarters for the researchers. Personal belongings give hints of their daily lives."));
        rooms.add(new Room("Central Hub", "A large room with pathways leading in various directions. An eerie silence pervades the space."));
        rooms.add(new Room("Storage Room", "Shelves lined with alien artifacts and supplies. Some items may be useful."));
        rooms.add(new Room("Communication Center", "A room filled with communication equipment, all silent now. A logbook sits on the console."));
        rooms.add(new Room("Power Core", "The heart of the temple. Energy pulses rhythmically from the core."));
        rooms.add(new Room("Sacred Chamber", "An ornate room, decorated with intricate carvings. A sense of unease fills the air."));
        rooms.add(new Room("The Shrine", "The final room. The air is thick with power. The ultimate secret of the temple lies here."));

        // Optionally, you can add items, puzzles, or monsters to each room
        // Example:
        // rooms.get(0).addItem(new Item("Flashlight", "A handy source of light."));
        // rooms.get(4).setHasMonster(true);
    }

    public void navigate(int roomIndex) {
        if (roomIndex < 0 || roomIndex >= rooms.size()) {
            System.out.println("Invalid room number.");
            return;
        }
        Room nextRoom = rooms.get(roomIndex);
        player.enterRoom(nextRoom);
    }

}
