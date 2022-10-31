import java.util.Scanner;

public class Account {

    private String name;
    private String accNum;
    private double balance;
    private String previousTransaction;
    Scanner scanner;

    public Account (String name, String accNum){
        scanner = new Scanner(System.in);
        balance = 0;
        this.name = name;
        this.accNum = accNum;
    }

    public void menu(){
        char choice = '\0';
        boolean flag = true;
        //scanner = new Scanner(System.in);
        System.out.println("Welcome " + name);
        System.out.println("Your account number is: " + accNum + "\n");
        System.out.println("What would you like to do?" + "\n");
        
        do {
            System.out.println("");
            System.out.println("A. Show balance" + "\n" + "B. Deposit money" + "\n" +
                "C. Withdraw money" + "\n" + "D. View previous transaction" + "\n" +
                "E. Exit" + "\n");
            System.out.println("Enter an option: ");

            choice = scanner.next().charAt(0);
            choice = Character.toUpperCase(choice);
            if (choice == 'A'){
                balance();
            } else if (choice == 'B') {
                deposit();
            } else if (choice == 'C') {

            } else if (choice == 'D') {

            } else if (choice == 'E') {
                System.out.println("Exited successfully");
                flag = false;
            } else {
                System.out.println("Invalid");
            }

        }while (flag);
    }

    private void balance(){
        System.out.println("**********************************************");
        System.out.println("Account balance = $" + balance);
        System.out.println("**********************************************");
    }

    private void deposit(){
        System.out.println("**********************************************");
        System.out.println("Enter the amount you wish to deposit:");
        System.out.println("**********************************************");
        scanner = new Scanner(System.in);
        double value;

        if (scanner.hasNextDouble()){
            value = Double.parseDouble(scanner.nextLine());
            System.out.println("\n" + "$" + value + " successfully deposited");
            previousTransaction = "Previous balance was: " + balance + "\n" 
                                    + "$" + value + " was deposited";
            balance = balance + value;
        }
        else{
            System.out.println("User input requires an number value" + "\n");
            deposit();
        }
    }

    private void withdraw(){
        System.out.println("**********************************************");
        System.out.println("Enter the amount you wish to withdraw");
        System.out.println("**********************************************");
        scanner = new Scanner(System.in);
        double value;

    }
}
