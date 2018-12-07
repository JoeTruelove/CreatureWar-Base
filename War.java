import java.util.ArrayList;
/**
 * Write a description of class War here.
 *
 * @author Joseph Truelove
 * @version 12.7.2018
 */
public class War
{
    // instance variables - replace the example below with your own
    private int i;
    private int tick;
    private int size = 10;
    Creature[] armyLight = new Creature[size];
    Creature[] armyDark = new Creature[10];
    private int light = 0;
    private int dark = 0;
    Creature soldierLight;
    Creature soldierDark;
    

    /**
     * Constructor for objects of class War
     */
    public War()
    {
        for (i = 0; i < size; i++)
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
        
        for (i = 0; i < size; i++)
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fight()
    {
        while (light < size && dark < size)
        {
            soldierLight = armyLight[light];
            soldierDark = armyDark[dark];
            
            while (soldierLight.isAlive() && soldierDark.isAlive())
            {
                soldierLight.takeDamage(soldierDark.damage());
                
                if (soldierLight.isDead())
                {
                    light++;
                    break;
                }
                
                soldierDark.takeDamage(soldierLight.damage());
                
                if (soldierDark.isDead())
                {
                    dark++;
                    break;
                }
            }
        }
        
        if (light == size & dark != size)
        {
            System.out.println("Army of Light has won!");
        }
        else if (dark == size && light != size)
        {
            System.out.println("Army of Dark has won!");
        }
        else if (light == size && dark == size)
        {
            System.out.println("Both Armies were wiped out");
        }
    }
}
