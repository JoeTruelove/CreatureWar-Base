
/**
 * This class extends from Creature and is the blueprint of an Elf
 * 
 * @author Joseph Truelove
 * @version 12.11.2018
 */
public class Elf extends Creature
{
       // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
    }
    
    /**
     * special damage type
     */
    public int damage()
    {
        int dam;
        if(Randomizer.nextInt(9) == 1)
        {
            dam = super.damage() * 2;
        }
        else
        {
            dam = super.damage();
        }
        return dam;
    }
    
    /**
     * name of Creature
     */
    public String toString()
    {
       return "Elf";
    }

}  

