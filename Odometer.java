/*****************************************************************************************************************************************
 * Ayoub Rammo

 * CSC 110AB

 * This class will be used to track fuel and mileage for an automobile. This program will ask the user to type the miles down, and reset too.

 * April 9, 2015.

 *****************************************************************************************************************************************/
import java.util.Scanner; //keyboard
import java.text.DecimalFormat; //number format
public class Odometer //class name 
{ 
    Scanner keyboard = new Scanner(System.in); //type 
    DecimalFormat gallons = new DecimalFormat("##.##"); //number formatting

    //private classes
    private int MPG; 
    private double Miles;
    private double Gas;
    private double LogMiles;
    public int UserInput;

    public int MPG()
    {
        System.out.println("What is the Mpg?"); // ask questions
        MPG = keyboard.nextInt();
        return MPG;
    }

    public double Miles() //miles
    {
        System.out.println("How many miles have vehicle driven?"); 
        Miles = keyboard.nextInt();
        return Miles;
    }

    public void printOutput() //to screen
    {
        Gas = (Miles/MPG); //dividing 
        System.out.println("After "+ Miles +" miles, you've used "+ gallons.format(Gas) +" gallons of gasoline.");
    }

    public double LogMiles() //additional 
    {
        System.out.println("How many more miles vehicle driven?"); //additional miles
        LogMiles = keyboard.nextInt();
        return LogMiles;

    }
    public void printLog() //to screen
    {
        Miles = Miles + LogMiles; //adding
        Gas = (Miles/MPG);
        System.out.println("After another " + LogMiles + " miles, you have used " + gallons.format(Gas) + " gallons of gasoline.");
    }

    public void reset()
    {

        boolean RESET = true; //is asking to reset the miles to 0 
        System.out.println("Enter 1 to reset miles: "); //press number

        //System.out.println("Press any number to continue: ");
        UserInput = keyboard.nextInt();
        if (UserInput != 1) //click the 1
        {
            System.out.println("Press number 1 to go to next trip");
            RESET = false; //statement is wrong
        }
        //boolean RESET = true;

        //while(RESET)
        if ( RESET)
        {
            System.out.println("Your miles have been reset to 0");
            System.out.println(); //space
            System.out.println("Press number 1 to go to next trip"); //to go to another trip
            Miles = 0; //set mile to zerp
            LogMiles = keyboard.nextInt();

        } 

    } //end
} //end