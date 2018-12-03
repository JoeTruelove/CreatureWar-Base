import java.util.Random;

/**
 * Creates a random number
 * 
 * @author Joseph Truelove 
 * @version 12.3.2018
 */
public class Randomizer
{
    // instance variables - replace the example below with your own
    private static Random rand;

    /**
     * Constructor for objects of class Randomizer
     */
    public Randomizer()
    {
        rand = new Random();
    }

    /**
     * Method to return a randome value from 0-y
     * 
     */
    public static int nextInt(int y)
    {
        if (rand == null) {
            rand = new Random();
        }
        
        return rand.nextInt(y);
    }
}