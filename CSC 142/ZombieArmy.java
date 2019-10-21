public class ZombieArmy
{
   private static int ZombieCount = 0;
   private int HP = 100;
   
   public ZombieArmy()
   {
      ZombieCount ++;
   }
   
   public ZombieArmy(int h)
   {
      HP = h;
      ZombieCount ++;
   }
 
   public String toString()
   {
      String resultStr = "My HP is: " + HP + " We now have " + ZombieCount + " soilders";
      return resultStr;
   }
   public boolean equals(ZombieArmy z)
   {
      boolean status;
      if(HP == z.HP)
         status = true;
      else
         status = false;
      return status;
   }
   public ZombieArmy copy()
   {
      ZombieArmy cloneZombie = new ZombieArmy(HP);
      return cloneZombie;
   }
   
   public int getArmySize()
   {
      return ZombieCount;
   }
   
   public static void displayArmySize(ZombieArmy z)
   {
      System.out.println(z.getArmySize());
   }
   
   public static ZombieArmy generateElite()
   {
      return new ZombieArmy(9999);
   }
   public int getHP()
   {
      return HP;
   }
}