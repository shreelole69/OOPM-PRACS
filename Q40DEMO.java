
import java.util.Scanner ;
/**
 *
 * @author SHREE
Write a program to determine the greater of the two numbers using method overloading
*/
class Greater
{
    Scanner scan = new Scanner(System.in);
    int a;
    Greater()
    {
        System.out.println("Enter Number : ");
        a = scan.nextInt();
    }
    void greater(Greater a , Greater b)
    {
        System.out.println("From two formal Class Parameter");
        if(a.a>b.a)System.out.println(""+a.a+" is Greater than "+b.a);
        else if(a.a<b.a)System.out.println(""+b.a+" is Greater than "+a.a);
        else System.out.println("Both are Equal");
    }
    void greater(Greater a)
    {
        System.out.println("From One Formal Class Parameter");
        if(this.a>a.a)System.out.println(""+this.a+" is Greater than "+a.a);
        else if(a.a<this.a)System.out.println(""+a.a+" is Greater than "+this.a);
        else System.out.println("Both are Equal");
    }
}
public class Q40DEMO {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Greater g1 = new Greater();
    Greater g2 = new Greater();
    g1.greater(g1, g2);
    g1.greater(g2);
    }
}











 