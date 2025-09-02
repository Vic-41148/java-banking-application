import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    static class Account
    {
        int accountNumber;
        String accountHolderName;
        double balance;
        String email;
        String phoneNumber;
        //cons
        Account()
        {
            accountNumber=0;
            accountHolderName="default";
            balance=0;
            email="default_email";
            phoneNumber="phone_default";
            System.out.println("Empty Account Created!");
        }
        Account(int acc,String accName,double bal,String em, String phNum)
        {
            accountNumber=acc;
            accountHolderName=accName;
            balance=bal;
            email=em;
            phoneNumber=phNum;
            System.out.println("Account Created!");
        }

        //func
        void deposit(double amt)
        {
            if(amt>0)
            {
                balance+=amt;
                System.out.println("Deposit successful!");
            }
            else
            {
                System.out.println("Error negative deposit!");
            }
        }
        void withdraw(double amt)
        {
            if(amt>0&&balance>=amt)
            {
                balance-=amt;
                System.out.println("Withdrawal successful!");
            }
            else
            {
                System.out.println("Error check your withdrawal amount and balance!");
            }
        }
        void displayAccountDetails()
        {
            System.out.println("////USER DETAILS////");
            System.out.println("name: "+accountHolderName);
            System.out.println("Account Number: "+accountNumber);
            System.out.println("Balance: "+balance);
            System.out.println("Email: "+email);
            System.out.println("Phone Number: "+phoneNumber);
            System.out.println("/////////////////");
        }
        void updateContactDetails(String em,String ph)
        {
            email=em;
            phoneNumber=ph;
            System.out.println("Contact Details updated!");
        }
        }
        static class userInterface
        {
            ArrayList<Account> arr;
            Scanner sc= new Scanner(System.in);

            //cons
            userInterface()
            {
                arr =new ArrayList<>();
            }

            //methods
            void createAccount(int acc,String accName,double bal,String em, String phNum)
            {
                arr.add(new Account(acc,accName,bal,em,phNum));
                System.out.println("Account Created successfully!");
            }

            void performDeposit(double amt,int id)
            {
                boolean found=false;
                for(Account i :arr)
                {
                    if(i.accountNumber==id)
                    {
                        found=true;
                        i.deposit(amt);
                    }
                }
                if(!found)
                {
                    System.out.println("Error no account found!");
                }
            }

            void performWithdrawal(double amt,int id)
            {
                boolean found=false;
                for(Account i :arr)
                {
                    if(i.accountNumber==id)
                    {
                        found=true;
                        i.withdraw(amt);
                    }
                }
                if(!found)
                {
                    System.out.println("Error no account found!");
                }
            }

            void showAccountDetails(int accNum)
            {
                boolean found=false;
                for(Account i :arr)
                {
                    if(i.accountNumber==accNum)
                    {
                        found=true;
                        i.displayAccountDetails();
                    }
                }
                if(!found)
                {
                    System.out.println("Error no account found!");
                }
            }

            void updateContact(int accNum,String em,String phn)
            {
                boolean found=false;
                for(Account i :arr)
                {
                    if(i.accountNumber==accNum)
                    {
                        found=true;
                        i.updateContactDetails(em,phn);
                    }
                }
                if(!found)
                {
                    System.out.println("Error no account found!");
                }
            }

            void mainMenu()
            {
                while(true)
                {
                    System.out.println("////Welcome to Ripoff bank////");
                    System.out.println("Enter your operation: ");
                    System.out.println("1.Account Creation");
                    System.out.println("2.Deposit");
                    System.out.println("3.Withdraw");
                    System.out.println("4.Check Account Details");
                    System.out.println("5.Update Account Details");
                    System.out.println("6.Exit");
                    System.out.println("//////////////////////////////");
                    int userInput=sc.nextInt();
                    sc.nextLine();

                    switch (userInput)
                    {
                        case 1:
                        {
                            int acc;
                            String accName;
                            double bal;
                            String em;
                            String phNum;

                            System.out.println("Enter your Account Number: ");
                            acc=sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter your Account Name: ");
                            accName=sc.nextLine();

                            System.out.println("Enter your Balance: ");
                            bal=sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter your Email: ");
                            em=sc.nextLine();

                            System.out.println("Enter your Phone Number: ");
                            phNum=sc.nextLine();

                            createAccount(acc,accName,bal,em,phNum);
                            break;
                        }
                        case 2:
                        {
                            double dp;
                            int accId;

                            System.out.println("Enter your Account Id: ");
                            accId=sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter your Deposit Amount: ");
                            dp=sc.nextInt();
                            sc.nextLine();

                            performDeposit(dp,accId);
                            break;
                        }
                        case 3:
                        {
                            double wtd;
                            int accId;

                            System.out.println("Enter your Account Id: ");
                            accId=sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter your Withdrawal Amount: ");
                            wtd=sc.nextInt();
                            sc.nextLine();

                            performWithdrawal(wtd,accId);
                            break;
                        }
                        case 4:
                        {
                            int accId;

                            System.out.println("Enter your Account Id: ");
                            accId=sc.nextInt();
                            sc.nextLine();

                            showAccountDetails(accId);
                            break;
                        }
                        case 5:
                        {
                            int accId;
                            String em;
                            String ph;

                            System.out.println("Enter your Account Id: ");
                            accId=sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter your email: ");
                            em=sc.nextLine();

                            System.out.println("Enter your phone number: ");
                            ph=sc.nextLine();

                            updateContact(accId,em,ph);
                            break;
                        }
                        case 6:
                        {
                            System.out.println("Thanks for using Ripoff bank!");
                            System.out.println("Exiting program");
                            return;
                        }
                        default:
                        {
                            System.out.println("Error in selection!");
                        }
                    }
                }
            }
        }
    public static void main(String[] args)
    {
        userInterface ui=new userInterface();
        ui.mainMenu();
    }
}
