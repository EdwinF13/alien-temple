package Alien_Temple;

class Weapon
{
    private Item weaponName;
    private Item weaponDescription;
    private String weaponStats;
    private int dmgOutput;

    public Item weaponName()
    {
        return weaponName;
    }

    public Item weaponDescription()
    {
        return weaponDescription;
    }

    public String getWeaponStats()
    {
        return weaponStats;
    }

    public int getDmgOutput()
    {
        return dmgOutput;
    }
}