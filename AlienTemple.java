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

