/*Todo
    *Antal sidor
    * Färg
    * Viktad
    *

 */

import java.util.Random;

public class Dice {
    //Attributes
    int sides = 6;

    Random random = new Random();
    int sidesShowing = random.nextInt(sides) +1;
    //int sidesShowing = 1;
    String color = "red";
    Boolean weighted = false;

    public Dice(){}

    public Dice(int newSides){
        sides = newSides;
    }



    //Methods
    public void rollDice(){
     Random random = new Random();
     sidesShowing = random.nextInt(sides) +1;
    }

    //Change the number of sides
    public void changeSides(){
        sides = 15;
    }
}

