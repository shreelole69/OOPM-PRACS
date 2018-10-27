
import java.util.Scanner ;
/**
 *
 * @author SHREE
To write a java program to create a Player class and inherit three classes Cricket_Player,
Football_Palyer and Hockey_Player.*/

class Player
{
    Scanner scan = new Scanner(System.in);
    int no ;
    String name ;
    Player()
    {
        System.out.println("Enter Name of Player : ");
        name =scan.next();
        System.out.println("Enter Player Number : ");
        no  = scan.nextInt();
    }
    void display()
    {
        System.out.print("Name : "+name+" No : "+no);
    }
}
class Cricket_Player extends Player
{    
  int  runs , wickets ;   
    Cricket_Player()
  {
      super() ;
      System.out.println("Enter Runs Scored : ");
      runs = scan.nextInt() ;
      System.out.println("Enter Wickets Taken : ");
      wickets  = scan.nextInt();
  }
    void display()
    {
        super.display();
        System.out.println(" Runs Scored : "+runs+" Wickets Taken : "+wickets);
    }
}
class Football_Player extends Player
{
   int goals ;
   
   public Football_Player() {
        super();
        System.out.println("Enter Goals Scored in Football Match : ");
        goals = scan.nextInt();
    }
    @Override
    void display()
    {
        super.display();
        System.out.println(" Goals Scored : "+goals);
    }
     
}
class Hockey_Player extends Player
{
   int goals ;
   
   public Hockey_Player() {
        super();
        System.out.println("Enter Goals Scored in Hockey Match : ");
        goals = scan.nextInt();
    }
    @Override
    void display()
    {
        super.display();
        System.out.println(" Goals Scored : "+goals);
    }
     
}
public class Q35DEMO {
    public static void main(String[] args) {
    System.out.println("Enter Details of Cricket Player : ");
    Cricket_Player c = new Cricket_Player();
    System.out.println("Enter Details of Football Player : ");
    Football_Player f  = new Football_Player();
    System.out.println("Enter Details of Hockey Player : ");
    Hockey_Player h = new Hockey_Player();
    System.out.println("Stored Details of Crickey Player");
    c.display();
    System.out.println("Stored Details of Football Player");
    f.display();
    System.out.println("Stored Details of Hockey Player");
    h.display();
    
    }
}











 