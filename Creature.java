
/**
 * The base of all creatures, setting their hp, strength, and whether they
 * are living or not.
 * 
 * @author Joseph Truelove
 * @version 12.7.2018
 */
public abstract class Creature
{
   private int hp;
   private int strength;
   private int max_hp;
   private boolean alive;
   private boolean dead;
   
   /**
    * Constructor
    */
   public Creature()
   {
       strength = 10;
       hp = 10;
       max_hp = hp;
   }
   
   /**
    * Method to return stats
    */
   public Creature(int hp, int strength)
   {
       this.hp = hp;
       this.strength = strength;
   }
   
   /**
    * return whether alive or not
    */
   public boolean isAlive()
   {
       boolean alive;
       if(hp > 0 )
       {
           alive = true;
       }
       else
       {
           alive = false;
       }
       return alive;
   }
   
   /**
    * return whether dead or not
    */
   public boolean isDead()
   {
      boolean dead;
      if(hp <= 0)
      {
          dead = true;
      }
      else
      {
          dead = false;
      }
      return dead;
    }
   
   /**
    * personal damage
    */
   public int damage()
   {
       return Randomizer.nextInt(strength) + 1;
   }
   
   /**
    * keep track of hp
    */
   public void takeDamage(int damage)
   {
       System.out.println(damage + " damage");
       hp = hp - damage;
   }
}
