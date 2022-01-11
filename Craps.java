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
            if (in.nextLine().substring(0,1).equalsIgnoreCase("y"))
            {
                return (true);
            }
            else if (in.nextLine().substring(0,1).equalsIgnoreCase("n"))
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
        while(running)
        {
            
        }
    }
    
    public static void main(String[] args)
    {        
        if (choice("Would you like to play a game of craps? [Y/n] "))
        {
            if (choice("Do you need instructions? [Y/n] "))
            {
                // print instructions, play game
            }
            else
            {
                // play game
            }
        }
        else
        {
            System.out.println("Maybe next time!");
        }
    }
}
