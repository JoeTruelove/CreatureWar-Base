
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Creature
{
   private int hp;
   private int strength;
   private int max_hp;
   
   public Creature()
   {
       strength = 10;
       hp = 10;
       max_hp = hp;
   }
   public Creature(int hp, int strength)
   {
       this.hp = hp;
       this.strength = strength;
   }
   
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
    
   public int damage()
   {
       return Randomizer.nextInt(strength) + 1;
   }
   
   public void takeDamage(int damage)
   {
       System.out.println(damage + " damage");
       hp = hp - damage;
   }
}
