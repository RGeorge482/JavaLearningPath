package Shape;
import Utilities.InputUtilities;

public class Client {
    public static void main(String[] args) {

        InputUtilities myInput = new InputUtilities();
        String name = myInput.getUserText("Please enter your name!");
        System.out.println("Hello " + name + ".");
    }
}
