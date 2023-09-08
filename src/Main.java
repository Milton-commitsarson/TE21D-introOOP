import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Create Dice
        Dice myDice = new Dice();
        // create second dice
        Dice myDice2 = new Dice();

        Dice myD20 = new Dice(20);
        System.out.println("new value " +myDice.sidesShowing);
        System.out.println("new value " +myDice2.sidesShowing);
        System.out.println("new value " +myD20.sidesShowing);
        myDice.rollDice();
        myDice2.rollDice();
        myD20.rollDice();
        System.out.println("second roll");
        System.out.println("new value " +myDice.sidesShowing);
        System.out.println("new value " +myDice2.sidesShowing);
        System.out.println("new value " +myD20.sidesShowing);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("do you want to roll again? Y/N" );

        String svar = myScanner.nextLine();


        if (svar.equals("y")){
            myDice.rollDice();
            myDice2.rollDice();
            myD20.rollDice();
            System.out.println("new value " +myDice.sidesShowing);
            System.out.println("new value " +myDice2.sidesShowing);
            System.out.println("new value " +myD20.sidesShowing);

            System.out.println("do you want to roll again? Y/N" );
        }
    }

}