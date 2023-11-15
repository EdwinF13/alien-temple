package Alien_Temple;

interface Item
{
    private String itemName;
    private String itemDescription;

    public String getItemName()
    {
        return itemName;
    }

    public String getItemDescription()
    {
        return itemDescription;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
    }

    public void printItemDetails()
    {
        System.out.println("Item: " + itemName);
        System.out.println("Info: " + itemDescription);
    }

    public Item(String itemName, String itemDescription)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }
}
