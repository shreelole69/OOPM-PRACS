
import java.util.Scanner ;
/**
 *
 * @author SHREE
 Assume that a bank maintains two kinds of accounts for its customers. The saving account provides
compound interest and withdrawal facilities but no cheque book facility . The current account
provides cheque book facility but no interest. Current account holders should also maintain a
minimum balance and if the balance falls below this level a service charge is imposed.

 */

class Account
{ 
    Scanner scan = new Scanner(System.in);
    String[] name = new String[100]; 
    int accno[] = new int[100];
    String[] type = new String[100] ;
    int[] balance=  new int[100];
    int count=0 ;
    Account()
    {
        System.out.println("*********Welcome To State Bank of India**********");
       for(int i=0 ; i<100 ; i++)
       {
           type[i] = "No Account";
       }
       
    }
    void createaccount()
    { 
        System.out.println("Enter Name : ");
        name[count] = scan.next();
        int choice;
        System.out.println("Enter Account no of Your Choice : ");
        accno[count] = scan.nextInt();
        System.out.println("Enter 1-Savings Account 2-Current Account : ");
        choice = scan.nextInt();
        switch(choice)
        {
            case 1:
        type[count] = "Saving";
        System.out.println("Enter Your Amount to Deposite Intially : ");
        balance[count] = scan.nextInt();
                break;
            case 2:
        type[count] = "Current" ;
        System.out.println("Enter Your Amount to Deposite Intially Which Should be Greater than 1000 : ");
        balance[count] = scan.nextInt();
        if(balance[count]<=1000)
        {
            System.out.println("Please Deposite More Money or Else 150rs Will be Decucted every Month");
        }
                break;
        }
        
        count++ ;
    }
    void intrest()
     {
        int no , index=0 , flag=0 ;
         System.out.println("Enter Account no : ");
         no = scan.nextInt();
         for(int i=0 ; i<count ; i++)
         {
             if(accno[i]==no)
             {
                 index=i;
                 flag=1;
             }   
         }
         if(flag==0)
         {
             System.out.println("No Account Found Register First");
             return ;
         }
         if(type[index]=="Current")
         {
             System.out.println("You have Current Account You cant Get Intrest");
             return ;
         }
         int amount  ,time ;
         System.out.println("Enter Amount To Deposit For Intrest");
         amount = scan.nextInt() ;
         if(amount>balance[index])
         {
             System.out.println("You Have Balance Less than amount Please Increase Balnce First");
             return ;
         }
         System.out.println("Enter Time period in Years");
         time = scan.nextInt();
         int intrest = (int) (amount*(1+0.3*time));
         System.out.println("Your Intrest after "+time+" Years will be "+intrest+" Press 1- confirm 2-exit");
         int choice = scan.nextInt();
         if(choice==1)
         {
             balance[index] = balance[index] - amount ;
             System.out.println("Amount "+amount+" Invested for "+time+" Years New Balnce : "+balance[index]);
         }
         else
         {
             System.out.println("Not Confirmed");
         }
                  
    }
     void withdraw()
     {
         int no , index=0 , flag=0 ;
         System.out.println("Enter Account no : ");
         no = scan.nextInt();
         for(int i=0 ; i<count ; i++)
         {
             if(accno[i]==no)
             {
                 index=i;
                 flag=1;
             }   
         }
         if(flag==0)
         {
             System.out.println("No Acoount Found Register First");
             return ;
         }
          int amount  ;
         System.out.println("Enter Amount To  Withdraw");
         amount = scan.nextInt() ;
         if(amount>balance[index])
         {
             System.out.println("You Have Balance Less than amount Please Increase Balnce First");
             return ;
         }
         balance[index] = balance[index] - amount ;
         System.out.println("New Balance is : "+balance[index]+" Amount Withdrawn : "+amount);
         
     }
     void deposit()
     {
             int no , index=0 , flag=0 ;
         System.out.println("Enter Account no : ");
         no = scan.nextInt();
         for(int i=0 ; i<count ; i++)
         {
             if(accno[i]==no)
             {
                 index=i;
                 flag=1;
             }   
         }
         if(flag==0)
         {
             System.out.println("No Acoount Found Register First");
             return ;
         }
          int amount  ;
         System.out.println("Enter Amount To  Deposit");
         amount = scan.nextInt() ;
         balance[index] = balance[index] + amount ;
         System.out.println("New Balance is : "+balance[index]+" Amount Deposited : "+amount);
     
     }
    void status()
    {
        
        int no , index=0 , flag=0 ;
         System.out.println("Enter Account no : ");
         no = scan.nextInt();
         for(int i=0 ; i<count ; i++)
         {
             if(accno[i]==no)
             {
                 index=i;
                 flag=1;
             }   
         }
         if(flag==0)
         {
             System.out.println("No Account Found Register First");
             return ;
         }
         System.out.println( "Name : "+name[index]+" Account no : "+accno[index]+" Balance : "+balance[index]);
    }
}

public class Q11DEMO {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        Account ac = new Account() ;
        int g=1 ;
        while(g!=0)
        {
            int choice=0 ;
            System.out.println("Enter 1-To Create Account 2-Calculate Intrest 3-Withdraw 4-Deposit 5-Status : ");
            choice = scan.nextInt() ;
            switch(choice)
            {
                case 1:
                    ac.createaccount();
                    break;
                case 2:
                    ac.intrest();
                    break ;
                case 3:
                    ac.withdraw();
                    break;
                case 4:
                    ac.deposit();
                    break;
                case 5: 
                    ac.status();
                    break ;
                default:
                    System.out.println("Enter Coorect Choice");
            }
            System.out.println("Enter 1 to Continue 0-Exit : ");
            g = scan.nextInt() ;
         
        }
     }
}











