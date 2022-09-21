import java.util.Scanner; //typing
public class OdometerDemo extends Odometer //class name
{
   public static void main(String[] args)
   {
        Scanner keyboard = new Scanner(System.in);

        int UserInput;
        Odometer trip1 = new Odometer();
        Odometer trip2 = new Odometer();
        
        System.out.println("Trip 1:"); //trip 1
        trip1.MPG(); //miles per gallon
        trip1.Miles(); 
        trip1.printOutput(); //show up on screen
        keyboard.nextLine();
        trip1.LogMiles(); //extra miles
        trip1.printLog(); //how up on screen & type tthings down
        
        trip1.reset();
        
        System.out.println("Trip 2 :"); //trip 2
        trip2.MPG(); //miles per gallon
        trip2.Miles();
        trip2.printOutput(); //show up on screen
        keyboard.nextLine();
        trip2.LogMiles(); //extra miles
        trip2.printLog();
        trip2.reset();
    } //end
} //end
        
