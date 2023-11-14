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