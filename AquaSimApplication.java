import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Sahil Pandit (should be Your Name)
 *  @version 4 October 2019  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
    public static void main(String args[])
    {
        System.out.println("Hello World.");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
        Random generator =new Random();
        
        int randNum = generator.nextInt(10);

        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(600, 480); // ... object that has now been created

        // Construct fish and add them to the aquarium.
        //      CODE MISSING HERE!
        AquaFish sahil;
        AquaFish Justin;
        AquaFish Trevor;
         // not running properly 
         
        aqua.add (sahil);
        aqua.add(Justin);
        aqua.add(Trevor);
        
        sahil.moveForward();
        Justin.moveForward();
        Trevor.moveForward();
        sahil.moveForward();
        Justin.moveForward();
        Trevor.moveForward();

        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua);  // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the Start button to start the simulation.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();


        // RUN THE AQUARIUM SIMULATION.

        // Make the fish move and redisplay.
        //      CODE MISSING HERE!
          for(int i=1;;)
          {
        
        
              
           if (sahil.atWall())
    
            sahil.changeDir();
            sahil. moveForward();
          
            if (Trevor.atWall())
            Trevor.changeDir();
            
            Justin.moveForward();
            if (Justin.atWall())
            Justin.changeDir();
            userInterface.showAquarium();
        
           


        // WRAP UP.
        Public static getColor()
        {
{
int randNum = generator.nextInt(10);
if (randNum==0)
}
return Color.RED;
else if (randNum==1)
return Color.BLUE;
else
}
return Color.GREEN;
}
}

        // Remind user how to quit application.
        userInterface.println ("Close GUI display window to quit.");

    }//end main

}//end class
}

