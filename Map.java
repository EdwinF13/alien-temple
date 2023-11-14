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