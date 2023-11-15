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

///////////////////////////////////////////////////////////

package Alien_Temple;

public class Weapon extends Item {
    private String weaponStats;
    private int damageOutput;

    public Weapon(String name, String description, int damageOutput, String weaponStats) {
        super(name, description);  // Call the constructor of the Item class
        this.damageOutput = damageOutput;
        this.weaponStats = weaponStats;
    }

    public String getWeaponStats() {
        return weaponStats;
    }

    public int getDamageOutput() {
        return damageOutput;
    }

    // You can add more methods specific to weapons, such as useWeapon, enhanceWeapon, etc.
}
