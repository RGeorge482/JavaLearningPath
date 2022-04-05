package Utilities;
import java.util.Scanner;

/**
 * Input Tasks Includes:
 * Keyboard Input Utilities
 * getUserText
 * getUserInt - with a range and a mimimum
 * getUserDouble - with a range
 */


public class InputUtilities {  
    
    /**
     * Get text from the user via keyboard
     * @param prompt - the message or request to the user
     * @return - the user input as a String
     */
    public String getUserText(String prompt) {
        Scanner myKB  = new Scanner(System.in);
        String userInput = "";

        do{
            System.out.println(prompt);
            System.out.println("You must enter letters only");
            userInput = myKB.nextLine();
        } while(!userInput.matches("[a-zA-Z]+"));

        myKB.close();
        return userInput;
    }

    

}