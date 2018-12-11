
/**
 * This class extends the Demon class and has higher stats than the
 * normal demon.
 * 
 * @author Joseph Truelove
 * @version 12.7.2018
 */
public class Balrog extends Demon
{
       // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
    }
    
    public int damage()
    {
        int dam = super.damage() * 2;
        return dam;
    }
    
    public String toString()
    {
       return "Balrog";
    }

}  

