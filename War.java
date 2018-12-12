import java.util.ArrayList;
/**
 * Creates two armies that will generate a random number of different creatures
 * that will fight each other untill the first army or both armies are dead
 *
 * @author Joseph Truelove
 * @version 12.7.2018
 */
public class War
{
    // instance variables - replace the example below with your own
    private int i;
    private int tick;
    private int sizeL = Randomizer.nextInt(125)+75;     //size of army of light
    private int sizeD = Randomizer.nextInt(50)+5;      //size of army of dark, in attempt to make it more balanced, lowered max size
    Creature[] armyLight = new Creature[sizeL];
    Creature[] armyDark = new Creature[sizeD];
    private int light = 0;
    private int dark = 0;
    Creature soldierLight;
    Creature soldierDark;
    

    /**
     * Constructor for objects of class War
     */
    public War()
    {
        for (i = 0; i < sizeL; i++)
        {
            tick = Randomizer.nextInt(10)+1;
            if (tick >= 1 && tick <= 6)
            {
                armyLight[i] = new Human();
            }
            else if (tick >= 7 && tick <= 10)
            {
                armyLight[i] = new Elf();
            }
            else
            {
                i--;
            }
        }
        
        for (i = 0; i < sizeD; i++)
        {
            tick = Randomizer.nextInt(10)+1;
            if (tick >= 1 && tick <= 5)
            {
                armyDark[i] = new Demon();
            }
            else if (tick >= 6 && tick <= 8)
            {
                armyDark[i] = new CyberDemon();
            }
            else if (tick >= 9 && tick <= 10)
            {
                armyDark[i] = new Balrog();
            }
            else
            {
                i--;
            }
        }
    }

    /**
     *The armyLight fight the armyDark in this method
     */
    public void fight()
    {
        while (light < sizeL && dark < sizeD)
        {
            soldierLight = armyLight[light];
            soldierDark = armyDark[dark];
            
            while (soldierLight.isAlive() && soldierDark.isAlive())
            {
                System.out.println(soldierLight.toString() + " deals");
                soldierDark.takeDamage(soldierLight.damage());
                
                if (soldierDark.isDead()) // check if dark is dead
                {
                    System.out.println(soldierDark.toString() + " has perished");
                    dark = dark + 1;
                    
                    break;
                }
                
                //soldierDark is second to attack
                System.out.println(soldierDark.toString() + " deals");
                soldierLight.takeDamage(soldierDark.damage());
                
                if (soldierLight.isDead()) //check if light is dead
                {
                    System.out.println(soldierLight.toString() + " has perished");
                    light = light + 1;
                    
                    break;
                }
                
                
            }
        }
        
        //Display of victor
        if (light == sizeL & dark != sizeD)
        {
            System.out.println("Army of Dark has won!");
        }
        else if (dark == sizeD && light != sizeL)
        {
            System.out.println("Army of Light has won!");
        }
        else if (light == sizeL && dark == sizeD)
        {
            System.out.println("Both Armies were wiped out");
        }
    }
}
