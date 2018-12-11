
/**
 * Extends from the Creature class but has a similar task to set a base for
 * the Demon creatures.
 * 
 * @author Joseph Truelove 
 * @version 12.3.2018
 */
public class Demon extends Creature
{
       // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 30;
    private static final int MIN_DEMON_HP = 15;
    private static final int MAX_DEMON_STR = 15;
    private static final int MIN_DEMON_STR = 10;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
    }
    
    public Demon(int hp, int strength)
    {
        super(hp, strength);
    }
    
    public int damage()
    {
        int dam;
        if(Randomizer.nextInt(19) == 1)
        {
            dam = super.damage() + 50;
        }
        else
        {
            dam = super.damage();
        }
        return dam;
    }
    
    public String toString()
    {
       return "Demon";
    }

}  

