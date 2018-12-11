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
    private int sizeL = Randomizer.nextInt(75)+25;
    private int sizeD = Randomizer.nextInt(75)+25;
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
            tick = Randomizer.nextInt(24)+1;
            if (tick >= 1 && tick <= 5)
            {
                armyLight[i] = new Human();
            }
            else if (tick >= 6 && tick <= 10)
            {
                armyLight[i] = new Elf();
            }
            else if (tick >= 11 && tick <= 15)
            {
                armyLight[i] = new Demon();
            }
            else if (tick >= 16 && tick <= 20)
            {
                armyLight[i] = new CyberDemon();
            }
            else if (tick >= 21 && tick <= 25)
            {
                armyLight[i] = new Balrog();
            }
            else
            {
                i--;
            }
        }
        
        for (i = 0; i < sizeD; i++)
        {
            tick = Randomizer.nextInt(24)+1;
            if (tick >= 1 && tick <= 5)
            {
                armyDark[i] = new Human();
            }
            else if (tick >= 6 && tick <= 10)
            {
                armyDark[i] = new Elf();
            }
            else if (tick >= 11 && tick <= 15)
            {
                armyDark[i] = new Demon();
            }
            else if (tick >= 16 && tick <= 20)
            {
                armyDark[i] = new CyberDemon();
            }
            else if (tick >= 21 && tick <= 25)
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
                //soldierLight is second to attack
                soldierLight.takeDamage(soldierDark.damage());
                
                if (soldierLight.isDead()) //check if light is dead
                {
                    light++;
                    break;
                }
                
                soldierDark.takeDamage(soldierLight.damage());
                
                if (soldierDark.isDead()) // check if dark is dead
                {
                    dark++;
                    break;
                }
            }
        }
        
        //Display of victor
        if (light == sizeL & dark != sizeD)
        {
            System.out.println("Army of Light has won!");
        }
        else if (dark == sizeL && light != sizeD)
        {
            System.out.println("Army of Dark has won!");
        }
        else if (light == sizeL && dark == sizeD)
        {
            System.out.println("Both Armies were wiped out");
        }
    }
}
