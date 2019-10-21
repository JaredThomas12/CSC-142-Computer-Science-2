public class ZombieArmyDemo
{
   public static void main(String[] args)
   {
      ZombieArmy z1 = new ZombieArmy();
      ZombieArmy z2 = new ZombieArmy();
      ZombieArmy z3 = new ZombieArmy();
      
      System.out.println(z1.toString());
      System.out.println(z2);
      System.out.println(z3);
      
      ZombieArmy elite = ZombieArmy.generateElite();
      System.out.println(elite.toString());
      System.out.println(z1.equals(z2));
      System.out.println(z2.equals(z1));
      System.out.println(elite.equals(z1));
      
      ZombieArmy z4;
      z4 = z1.copy();
      System.out.println(z4);
      
      ZombieArmy elite2 = elite.copy();
      System.out.println(elite2);
      //System.out.println(z2.getArmySize());
     /// ZombieArmy.displayArmySize(z1);
      //System.out.println(z1);
     /*System.out.println(z1.getHP());
      System.out.println(elite.getHP());*/
   }
}