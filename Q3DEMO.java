
import java.util.Scanner;
/**
 *
 * @author SHREE
 */
class BlueMoon
{ 
    Scanner scan = new Scanner(System.in) ;
    String arrname[] = new String[100] ;
    int[] mobileno = new int[100] ;
    String[] roombooked = new String[100];

    int count=0;
    BlueMoon()
    {
        System.out.println("**********Welcome To Hotel Blue Moon**********");
    for(int i=0 ; i<roombooked.length ;i++)
    {
        roombooked[i] = "No Booking";
    }
    }
    void register()
    {
         
        System.out.println("Enter Name : ");
        arrname[count]=scan.next();
        System.out.println("Enter Mobile no");
        mobileno[count] = scan.nextInt();
        count++ ;
        System.out.println("Registered Sucessfully");
    }
    void RoomBooking()
    {   
        int index=0 ,choice , payement , flag=0,no;
        System.out.println("Enter Registered Mobile No : ");
        no=scan.nextInt() ;
        for(int i=0 ; i<count ; i++)
        {
            if(mobileno[i]==no)
            {
                index = i ;
                flag=1 ;
            }
        }
        if(flag==0)
        {
            System.out.println("Not Registered Register First");
            return  ;
        }
        System.out.println("Enter For 1-Normal and 2-Delux : ");
        choice = scan.nextInt() ;
        switch(choice)
        {
            case 1:
            payement=500  ;    
            roombooked[index] = "Normal Booking";
            System.out.println("Booked Sucessfully");
            System.out.println("Pay : "+payement);
            break ;
            case 2:
            payement=1000 ;
            roombooked[index] = "Delux Booking" ;
            System.out.println("Booked Sucessfully");
            System.out.println("Pay : "+payement);
        
            break ;
            default:
            System.out.println("Enter Correct Choice");
        }
        
    }
    void status()
    {
        int index=0 , flag=0,no ;
        System.out.println("Enter Registered Mobile No : ");
        no=scan.nextInt() ;

        for(int i=0 ; i<count ; i++)
        {
            if(mobileno[i]==no)
            {
                index = i ;
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Register First");
            return ;
        }
        System.out.println("Name : "+arrname[index]+" Mobile : "+mobileno[index]+" Status : "+roombooked[index]);
    }
     void Cancellation()
     {
         int index=0 , flag=0 , no ;
        System.out.println("Enter Registered Mobile No : ");
        no=scan.nextInt() ;
        for(int i=0 ; i<count ; i++)
        {
            if(mobileno[i]==no)
            {
                index = i ;
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Register First");
            return ;
        }
        switch(roombooked[index])
        {
            case "Normal Booking" :
              roombooked[index]="No Booking" ;
              System.out.println("Canceled Sucesssfully Take the refund of 500");
              break ;
            case "Delux Booking" :  
              roombooked[index]="No Booking" ;
              System.out.println("Canceled Sucesssfully Take the refund of 1000");
              break ;
             default :
             System.out.println("No Booking Please Book first Before Cancellation");
              
             
        }
     }
    
}

public class Q3DEMO {
    public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
	   BlueMoon BM = new BlueMoon() ;
	   int g=1;
	   while(g!=0)
	   {
	       int choice , no;
	       System.out.println("Enter 1-Register 2-RoomBooking 3-Status 4-Cancellation : ");
	       choice = scan.nextInt();
	       switch(choice)
	       {
	           case 1:
	               BM.register() ;
	               break;
	           case 2:
	               BM.RoomBooking() ;
	               break;
	           case 3:
	               BM.status();
	               break ;
	           case 4:
	               BM.Cancellation() ;
	               break ;
	           default:
	           System.out.println("Enter Correct Choice");
	       
	       }
	       System.out.println("Enter 1-Continue or 0-Exit");
	       g = scan.nextInt();
	   }
}
}
