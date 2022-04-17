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


        /**
     * Ask user to input an number within a range and return an integer value
     * If not valid, keep asking
     * 
     * @param prompt -- the message or question to the user
     * @param minValue -- the lowest value allowed
     * @param maxValue -- the highest value allowed
     * @return -- valid user input
     */
    public int getUserInt(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        boolean valid = false;
        int userInput=-1; //defaulted to -1 because tI need to have a value
        
        do{
            
            System.out.println(prompt);
            
            //confirm range to user
            System.out.println("You must enter a number between " + minValue + " and " + maxValue);
            
            try {
                userInput = Integer.parseInt(myKB.nextLine());
                
                //check that the value is allowed by checking range
                if ( (userInput < minValue) || ( userInput > maxValue) ){
                    
                    System.out.println("Invalid value entered. Please enter a number within the range specified");
                    
                }
                else {
                    //must be OK
                    valid = true;
                }
                
            }catch(Exception e){
                // this will be if the parseInt threw an error -- so the user did not enter a number
                System.out.println("That was not an integer value! please try again!");
               
            }
            
            
        }while (!valid);
        
        //userInput must be correct now
        myKB.close();
        return (userInput);
        
    }

    

}