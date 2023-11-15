package Alien_Temple;

public class Weapon {
    private Item weaponName;
    private Item weaponDescription;
    private String weaponStats;
    private int dmgOutput;

    public Weapon(Item weaponName, Item weaponDescription, String weaponStats, int dmgOutput) {
        this.weaponName = weaponName;
        this.weaponDescription = weaponDescription;
        this.weaponStats = weaponStats;
        this.dmgOutput = dmgOutput;
    }

    public Item getWeaponName() {
        return weaponName;
    }

    public Item getWeaponDescription() {
        return weaponDescription;
    }

    public String getWeaponStats() {
        return weaponStats;
    }

    public int getDmgOutput() {
        return dmgOutput;
    }

    public static void main(String[] args) {
        // Creating a rifle
        Item rifleName = new Item("Rifle", ItemType.WEAPON);
        Item rifleDescription = new Item("Powerful long-range firearm", ItemType.DESCRIPTION);
        String rifleStats = "Accuracy: High, Range: Long";
        int rifleDmgOutput = 50;

        Weapon rifle = new Weapon(rifleName, rifleDescription, rifleStats, rifleDmgOutput);

        // Creating a pistol
        Item pistolName = new Item("Pistol", ItemType.WEAPON);
        Item pistolDescription = new Item("Compact sidearm", ItemType.DESCRIPTION);
        String pistolStats = "Accuracy: Medium, Range: Short";
        int pistolDmgOutput = 30;

        Weapon pistol = new Weapon(pistolName, pistolDescription, pistolStats, pistolDmgOutput);

        
        Item barefistsName = new Item("Barefists", ItemType.WEAPON);
        Item pistolDescription = new Item("Unarmed", ItemType.DESCRIPTION);
        String pistolStats = "Accuracy: High, Range: Short";
        int pistolDmgOutput = 5;

        Weapon barefists = new Weapon(pistolName, pistolDescription, pistolStats, pistolDmgOutput);        // You can now use the rifle and pistol objects as needed
    }
}
