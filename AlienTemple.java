package Alien_Temple;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

public class AlienTemple
{
    public void startGame()
    {
        System.out.println(introParagraph);
        // game functionality stuff goes here
    }
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            // Intro
            String introParagraph = "ALIEN TEMPLE\n\n"
                + "The year is 2739. You are a space adventurer,\n"
                + "answering the distress call of a research outpost\n"
                + "on a mysterious planet. When you arrive at the\n"
                + "outpost, you find it abandoned: the researchers\n"
                + "were apparently investigating a nearby alien temple,\n"
                + "but one day it seems they never returned from the\n"
                + "temple, and yet strangely their distress beacon was\n"
                + "activated. Seeing no other choice, you enter the\n"
                + "temple hoping to rescue the missing researchers....\n";
            System.out.println(introParagraph);


            // Instead of immediately asking if the player wants to venture forth, lets use that for when the
            // player opts to start a NEW game, so at the start menu there should be a few options, including:
            // new game, load game, quit, anything else we can think of. -Alec

            // Actually, that does make sense. Real quick question: does next() only take in one word, or can
            // it also take multiple? - Dan
    
            String choice = sc.next();

            // get rid of everyting except choice? - Dan
            // I think we can keep the intro paragraph, makes sense to have it print with the start of the game
            // as like an openning crawl- Alec
            
            // I see what you mean, but wouldn't you print that before the game starts as well? - Dan
            // No need to print it at the beginning of the program...

            // I gotcha. Yeah, lets move that to the start new game option then. -Alec   
            
            // Cool. Will the main menu just be a switch statement? - Dan

            // That sounds good, swtch statement I think would be best in case we wanted to add
            // stuff  
            
            switch(choice)
            {
                case "new game":
                    // startGame();
                case "load game":
                    // something here
                case "quit":
                    break;
            }
            // for the new game option: 
            // 1) ask the player for a file name
            // 2) create file with that name
            // 3) then just run loadGame() lol

            // What's a save file's usual extension? (like .exe, .dmg, .c, .java, ...)

            // Looks like it's typically .gam
            
            if(choice == "new game")
            {
                System.out.println(introParagraph);
                // startGame();
            }
            else if(choice == "load game")// guilt-trip the player ig...
            {
                // maybe let's not do this lol
                // System.out.println("\nUpon reaching the temple where the signal was received, you suddenly begin to have second thoughts on whether you actually want to enter or not. You suddenly started to fear for your life and what the worst thing would happen once you set foot inside. Eventually, you give up, take the ship back home. Everybody back at the station asks what happened, and you describe why you didn't go in. They try to comfort you and say that it's okay, but in reality they despise you because you turned out to be a fuckin' coward. \"How could you?\", \"You left them to die. \", \"This is all your fault.\" You are filled with so much dread until you decide to leave the station for good because you couldn't live with the choice that you made, merely hoping that you are gone for good, so that everyone will forget that you existed... ");
                sc.close();
                return;
            }
            sc.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }              
}

/////////////////////////////////////////////////////////////////////////////////

package Alien_Temple;

import java.util.Scanner;

public class AlienTemple {
    private Researcher player;
    private Map gameMap;

    public AlienTemple() {
        this.player = new Researcher("Space Adventurer", 100);
        this.gameMap = new Map(player);
        // Initialize the game map with rooms, items, etc.
    }

    public void startGame() {
        // Assuming introParagraph is a class member now
        System.out.println(introParagraph);
        gameMap.navigate(0); // Start the player in the first room
        gameLoop();
    }

    private void gameLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        while (gameRunning) {
            System.out.println("\nChoose an action: [navigate] [inventory] [quit]");
            String action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "navigate":
                    handleNavigation(scanner);
                    break;
                case "inventory":
                    player.getInventory().displayInventory();
                    break;
                case "quit":
                    gameRunning = false;
                    System.out.println("Exiting game...");
                    break;
                default:
                    System.out.println("Invalid action. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private void handleNavigation(Scanner scanner) {
        System.out.println("Enter the room number to navigate:");
        int roomIndex;
        try {
            roomIndex = Integer.parseInt(scanner.nextLine()) - 1; // Adjust for zero-based indexing
            gameMap.navigate(roomIndex);
        } catch (NumberFormatException e) {
            System.out.println("Invalid room number. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        try {
            AlienTemple game = new AlienTemple();
            Scanner sc = new Scanner(System.in);

            // Intro paragraph
            String introParagraph = "ALIEN TEMPLE\n\n" +
                "The year is 2739. You are a space adventurer,\n" +
                "answering the distress call of a research outpost\n" +
                "on a mysterious planet. When you arrive at the\n" +
                "outpost, you find it abandoned; the researchers\n" +
                "were apparently investigating a nearby alien temple,\n" +
                "but one day it seems they never returned from the\n" +
                "temple, and yet strangely their distress beacon was\n" +
                "activated. Seeing no other choice, you enter the\n" +
                "temple hoping to rescue the missing researchers....\n";
            
            System.out.println("Do you want to start a new game or load an existing game? [new/load]");
            String choice = sc.nextLine().toLowerCase();

            switch (choice) {
                case "new":
                    game.startGame();
                    break;
                case "load":
                    // Load game functionality (to be implemented)
                    break;
                default:
                    System.out.println("Exiting game...");
                    break;
            }

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
package Alien_Temple;

import java.util.Scanner;



public class AlienTemple {
    
    int choice;
    int playerHP;
    int monsterHP;
    String playerName;
    String playerWeapon;
    int NorthKey;
    int obeliskKey;
    
    Scanner myScanner = new Scanner(System.in);

public static void main(String[] args){
        AlienTemple game;
        game = new AlienTemple();
        game.playerSetUp();
        game.Room();
    }
  
public void playerSetUp(){
  
  playerHP = 300;
  monsterHP = 500;
 
  String playerWeapon;
  playerWeapon ="Barefist";
  

  System.out.println("Your Hp: " +playerHP);
  System.out.println("Your weapon: " +playerWeapon);

  String playerName;

  

  System.out.println("Please enter your name: \n");
  playerName = myScanner.nextLine();

  System.out.println("Hello " + playerName + ", let us begin!!\n");
  System.out.println("");
  String introParagraph = "ALIEN TEMPLE\n\n"
  + "The year is 2739. You are a space adventurer,\n"
  + "answering the distress call of a research outpost\n"
  + "on a mysterious planet. When you arrive at the\n"
  + "outpost, you find it abandoned: the researchers\n"
  + "were apparently investigating a nearby alien temple,\n"
  + "but one day it seems they never returned from the\n"
  + "temple, and yet strangely their distress beacon was\n"
  + "activated. Seeing no other choice, you enter the\n"
  + "temple hoping to rescue the missing researchers....\n";
System.out.println(introParagraph);



}


public void Room() {

    System.out.println("\n--------------------------------------------\n");
    System.out.println(" You have entered the Main room you see different symbols of what appears to be different shapes and notice the place is eerie and silent ");
    System.out.println(" You find a dead body could this be one of the researchers you ask?");
    System.out.println("You approach the body");
    
        
        System.out.println("You found one of the researchers his body seems to have multiple scratches.");
        System.out.println(" You hear rumbling.............");
        System.out.println(" The door has closed behind you, you try to open it and it is locked");
        System.out.println("You see three different rooms which one do you want to enter?");
        System.out.println("\n-----------------------------------\n");
        System.out.println("1: Go to West Room");
        System.out.println("2:Go to North Room ");
        System.out.println("3: Go to East Room");
         System.out.println("4: Main door out");
        choice = myScanner.nextInt();
      if (choice == 1)
      {
        WestRoom();
    }

      if (choice == 2){
        
            NorthRoom();
        }
        
    

    if (choice == 3){
        EastRoom();
    
    }

    if (choice == 4){
        if(obeliskKey == 1){
            end();
        }else{
            System.out.println("Door is locked");
            MainRoom();
                }
            }
        }
    


    

public void WestRoom(){
    System.out.println("\n--------------------------------------------\n");
   System.out.println(" You have entered a strange room you find what appears to be a stream and you are thirsty\n");
   System.out.println(" What do you want to do ?\n");
    System.out.println("1:Drink the water ");
    System.out.println("2:leave it alone");
    
     
    choice = myScanner.nextInt();
    if(choice == 1 ){
        if (playerHP < 400){
         System.out.println("\n------------------------------------------------------------------\n");
         System.out.println("Your HP increased.\n");
         playerHP = playerHP + 10;
         System.out.println("Your HP: " + playerHP);
         
         MainRoom();
        }
      else {
        System.out.println("You are at max Health!");
        
    }
    MainRoom();
} else if (choice == 2){
    MainRoom();
}
}
public void NorthRoom(){
    System.out.println("\n------------------------------------------------------------------\n");
    System.out.println("The door closes behind you\n");
    System.out.println("You encounter some form of alien lifeform that is running towards you\n");
    System.out.println("What do you want to do?\n");
    System.out.println("1: Run to the door and try to open it");
    System.out.println("2: Fight ");
    

    choice = myScanner.nextInt();

    if (choice == 1) {
        System.out.println("Door locked!");
        NorthRoom();
        
    } else if (choice == 2) {
        fight();
    } else {
        NorthRoom();
    }
}

public void MainRoom(){
    System.out.println("\n--------------------------------------------\n");
    System.out.println(" Main room\n");
    System.out.println("1:Go to West Room");
    System.out.println("2:Go to North room ");
    System.out.println("3:Go to East Room");
    System.out.println("4:Get out of temple");
    
    choice = myScanner.nextInt();

    if (choice == 1){
        WestRoom();
    }

     if (choice == 2){

            NorthRoom();
        }
       
    

    if (choice == 3){
        EastRoom();
    }  
if (choice == 4){
        if(obeliskKey == 1){
            end();
        }else{
            System.out.println("Door is locked");
            MainRoom();
                }
            }


}
    
    
public void EastRoom(){
    System.out.println("\n--------------------------------------------\n");
    System.out.println("You find another researcher dead but he carried a Rifle!!");
    System.out.println("You take the Rifle with you along with a key that he carried ");
    NorthKey = 1;
    playerWeapon ="Rifle";
    System.out.println("Your Weapon:\n " +playerWeapon);
    System.out.println("\n\n1: Go back to the main road");
    System.out.println("\n--------------------------------------------\n");
    choice = myScanner.nextInt();

    if(choice == 1)
    {
    
        MainRoom();
    } else {
        MainRoom();
    }
    
   }

    






  
    



public void fight() {
    
    System.out.println("\n------------------------------------------------------------------\n");
    System.out.println("Your HP: " + playerHP);
    System.out.println("Monster HP: " + monsterHP);
    System.out.println("\n1:Attack");
    System.out.println("\n------------------------------------------------------------------\n");

    choice = myScanner.nextInt();

    
    if (choice == 1) {
    
        attack();
    }
        else {
           fight();
        }
    }




public void attack() {
    int playerDamage = 10;
    if (playerWeapon == null) {
        // Initialize playerWeapon to a default value if it is null
        playerWeapon = "Barefist"; // Or any other default weapon
    }
    if (playerWeapon.equals("Rifle")) {
        playerDamage = new java.util.Random().nextInt(90);
    } else if(playerWeapon.equals("Barefist")){
        playerDamage = new java.util.Random().nextInt(20);
    }
    

    System.out.println("You attacked the monster and gave " + playerDamage + " damage!");

    monsterHP = monsterHP - playerDamage;

    System.out.println("Monster HP: " + monsterHP);

    if (monsterHP < 1) {
        win();
    } 
    else if (monsterHP > 0) {
        int monsterDmg = 15;

        monsterDmg= new java.util.Random().nextInt(55);
        System.out.println("The monster attacked you and gave " + monsterDmg + " damage!");

        playerHP = playerHP - monsterDmg;

        System.out.println("Player HP: " + playerHP);

        if (playerHP < 1) {
            dead();
        } 

         else if (playerHP > 0){
           
             fight();
            }
        }
    }

    




public void dead() {
    System.out.println("\n------------------------------------------------------------------\n");
    System.out.println("YOU DIED!!!");
    System.out.println("\n\nGAME OVER");
    System.out.println("\n------------------------------------------------------------------\n");
    System.exit(0);
}


public void win() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You killed the Alien!");
		System.out.println("The monster dropped a obelisk key!");
		System.out.println("You obtained an obelisk key!\n\n");
		System.out.println("1: You use it to open the door!");
		System.out.println("\n------------------------------------------------------------------\n");

		
        obeliskKey = 1;
		choice = myScanner.nextInt();
		if (choice == 1) {
			MainRoom();
		}

	}

public void end() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You avenged the fellow Researchers and live for another Adventure!!!");
		System.out.println("\n\n  THE END                 ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
}


