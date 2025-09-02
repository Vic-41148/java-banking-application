import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    class Account {
        int accountNumber;
        String accountHolderName;
        double balance;
        String email;
        String phoneNumber;

        // Constructors
        Account() {
            accountNumber = 0;
            accountHolderName = "default";
            balance = 0;
            email = "default_email";
            phoneNumber = "phone_default";
            System.out.println("Empty Account Created!");
        }

        Account(int acc, String accName, double bal, String em, String phNum) {
            accountNumber = acc;
            accountHolderName = accName;
            balance = bal;
            email = em;
            phoneNumber = phNum;
            System.out.println("Account Created!");
        }

        // Functions
        void deposit(double amt) {
            if (amt > 0) {
                balance += amt;
                System.out.println("Deposit successful!");
            } else {
                System.out.println("Error: negative deposit!");
            }
        }

        void withdraw(double amt) {
            if (amt > 0 && balance >= amt) {
                balance -= amt;
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Error: check your withdrawal amount and balance!");
            }
        }

        void displayAccountDetails() {
            System.out.println("////USER DETAILS////");
            System.out.println("Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("///////////////////");
        }

        void updateContactDetails(String em, String ph) {
            email = em;
            phoneNumber = ph;
            System.out.println("Contact Details updated!");
        }
    }

    class userInterface {
        ArrayList<Account> arr;
        Scanner sc = new Scanner(System.in);

        // Constructor
        userInterface() {
            arr = new ArrayList<>();
        }

        // Helper to find account
        Account findAccount(int accNum) {
            for (Account a : arr) {
                if (a.accountNumber == accNum) return a;
            }
            return null;
        }

        // Methods
        void createAccount(int acc, String accName, double bal, String em, String phNum) {
            arr.add(new Account(acc, accName, bal, em, phNum));
            System.out.println("Account Created successfully!");
        }

        void performDeposit() {
            System.out.print("Enter account number: ");
            int accNum = sc.nextInt();
            sc.nextLine();
            Account a = findAccount(accNum);
            if (a != null) {
                System.out.print("Enter amount to deposit: ");
                double amt = sc.nextDouble();
                sc.nextLine();
                a.deposit(amt);
            } else {
                System.out.println("Error: no account found!");
            }
        }

        void performWithdrawal() {
            System.out.print("Enter account number: ");
            int accNum = sc.nextInt();
            sc.nextLine();
            Account a = findAccount(accNum);
            if (a != null) {
                System.out.print("Enter amount to withdraw: ");
                double amt = sc.nextDouble();
                sc.nextLine();
                a.withdraw(amt);
            } else {
                System.out.println("Error: no account found!");
            }
        }

        void showAccountDetails() {
            System.out.print("Enter account number: ");
            int accNum = sc.nextInt();
            sc.nextLine();
            Account a = findAccount(accNum);
            if (a != null) a.displayAccountDetails();
            else System.out.println("Error: no account found!");
        }

        void updateContact() {
            System.out.print("Enter account number: ");
            int accNum = sc.nextInt();
            sc.nextLine();
            Account a = findAccount(accNum);
            if (a != null) {
                System.out.print("Enter new email: ");
                String em = sc.nextLine();
                System.out.print("Enter new phone: ");
                String ph = sc.nextLine();
                a.updateContactDetails(em, ph);
            } else System.out.println("Error: no account found!");
        }

        void mainMenu() {
            int choice = 0;
            do {
                System.out.println("\n////Welcome to Ripoff Bank////");
                System.out.println("1. Account Creation");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Check Account Details");
                System.out.println("5. Update Contact Details");
                System.out.println("6. Exit");
                System.out.println("//////////////////////////////");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter your Account Number: ");
                        int acc = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter your Account Name: ");
                        String accName = sc.nextLine();
                        System.out.print("Enter your Balance: ");
                        double bal = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter your Email: ");
                        String em = sc.nextLine();
                        System.out.print("Enter your Phone Number: ");
                        String phNum = sc.nextLine();
                        createAccount(acc, accName, bal, em, phNum);
                        break;
                    case 2:
                        performDeposit();
                        break;
                    case 3:
                        performWithdrawal();
                        break;
                    case 4:
                        showAccountDetails();
                        break;
                    case 5:
                        updateContact();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 6);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        userInterface ui = m.new userInterface();
        ui.mainMenu();
    }
}
