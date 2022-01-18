/**
 * Write a description of class Craps here.
 *
 * @author Charlie Brunold
 * @version 2022-01-11
 */

import java.util.Scanner;

public class Craps
{
    public static Scanner in = new Scanner(System.in);
    
    public static boolean choice(String message)
    {
        System.out.print(message);
        while (true)
        {
            if (in.nextLine().equalsIgnoreCase("y"))
            {
                return (true);
            }
            else if (in.nextLine().equalsIgnoreCase("n"))
            {
                return (false);
            }
            else 
            {
                System.out.println("ERROR: Unidentified input. Please try again.");
            }
        }
    }
    
    public static void playGame()
    {
        boolean running = true;
        while(true)
        {           
            int point = 0;
            Die die1 = new Die();
            Die die2 = new Die();
            while(running)
            {
                System.out.println("Roll 1: ");
                System.out.println("Die1: " + die1.getRoll() + ", Die2: " + die2.getRoll() + ", Total Roll: " + (die1.getRoll() + die2.getRoll()));
                if ((die1.getRoll() + die2.getRoll() == 7) || (die1.getRoll() + die2.getRoll() == 11))
                {
                    System.out.println("You rolled a " + (die1.getRoll() + die2.getRoll()));
                    System.out.println("You win!");
                    System.out.println("");
                    running = false;
                    break;
                }
                else if ((die1.getRoll() + die2.getRoll() == 2) || (die1.getRoll() + die2.getRoll() == 3) || (die1.getRoll() + die2.getRoll() == 12))
                {
                    System.out.println("You rolled a " + (die1.getRoll() + die2.getRoll()));
                    System.out.println("You lose.");
                    System.out.println("");
                    running = false;
                    break;
                }
                else
                {
                    System.out.println("You rolled a " + (die1.getRoll() + die2.getRoll()));
                    System.out.println("You neither won nor lost, therefore your 'point' value is now " + (die1.getRoll() + die2.getRoll()));
                    System.out.println("Press [ENTER] to roll again...");
                    point = (die1.getRoll() + die2.getRoll());
                    in.nextLine();
                    for (int i = 2; i < 9999; i++)
                    {                    
                        System.out.println("Roll " + i + ": ");
                        System.out.println("Die1: " + die1.rollDie() + ", Die2: " + die2.rollDie() + ", Total Roll: " + (die1.getRoll() + die2.getRoll()));
                        if (die1.getRoll() + die2.getRoll() == 7)
                        {
                            System.out.println("You rolled a " + (die1.getRoll() + die2.getRoll()));
                            System.out.println("You lose.");
                            System.out.println("");
                            running = false;
                            break;
                        }
                        else if (die1.getRoll() + die2.getRoll() == point)
                        {
                            System.out.println("You rolled a " + (die1.getRoll() + die2.getRoll()));
                            System.out.println("You win!");
                            System.out.println("");
                            running = false;
                            break;
                        }
                        else
                        {
                            System.out.println("You rolled a " + (die1.getRoll() + die2.getRoll()));
                            System.out.println("Press [ENTER] to roll again...");
                            in.nextLine();
                        }
                    }
                }                
            }
            if (choice("Would you like to play again? [Y/n] "))
            {
                    System.out.println("Restarting...");
                    running = true;
            }
            else
            {
                break;
            }
        }
    }
    
    public static void main(String[] args)
    {      
        if (choice("Would you like to play a game of craps? [Y/n] "))
        {
            if (choice("Do you need instructions? [Y/n] "))
            {
                // print instructions, play game
                 System.out.println("1. Roll two six-sided dice.");
                 System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
                 System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
                 System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
                 System.out.println("3. Keep rolling the dice again until:");
                 System.out.println("4. a. You roll the point again and win!");
                 System.out.println("4. b. or you roll a 7 and lose.");
                 System.out.println("Good luck!");
                 System.out.println("");
                 playGame();
                 System.out.println("Thank you for playing!");
            }
            else
            {
                System.out.println("Good luck!");
                playGame();
                System.out.println("Thank you for playing!");
            }
        }
        else
        {
            System.out.println("Maybe next time!");
        }
    }
}
