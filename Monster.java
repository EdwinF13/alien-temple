package Alien_Temple;

class Monster
{
    private String monsterSpecies;
    private String monsterDescription;
    private int monsterHp;
    private int monsterDamageOutput;

    public String getMonsterSpecies()
    {
        return monsterSpecies;
    }

    public String getMonsterDescription()
    {
        return monsterDescription;
    }

    public int getMonsterHp()
    {
        return monsterHp;
    }

    public int getMonsterDamageOutput()
    {
        return monsterDamageOutput;
    }

    public void printMonsterDetails()
    {
        System.out.println("Species: " + monsterSpecies);
        System.out.println("About: " + monsterDescription);
        System.out.println("HP: " + monsterHp);
        System.out.println("DMG Output: " + monsterDamageOutput);
    }
}