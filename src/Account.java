import java.util.Scanner;

public class Account {

    private String name;
    private String accNum;
    private double balance;
    private String previousTransaction;
    private Scanner scanner;

    public Account (String name, String accNum){
        scanner = new Scanner(System.in);
        balance = 0;
        previousTransaction = "-";
        this.name = name;
        this.accNum = accNum;
    }

    public void menu(){
        char choice = '\0';
        boolean flag = true;
        //scanner = new Scanner(System.in);
        System.out.println("Welcome " + name);
        System.out.println("Your account number is: " + accNum + "\n");
        System.out.println("What would you like to do?");
        
        do {
            System.out.println("");
            System.out.println("**********************************************");
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
                withdraw();
            } else if (choice == 'D') {
                history();
            } else if (choice == 'E') {
                System.out.println("Exited successfully");
                flag = false;
            } else {
                System.out.println("Invalid");
            }

        }while (flag);
    }

    private void balance(){
        System.out.println("Account balance = $" + balance);
        System.out.println("**********************************************");
    }

    private void deposit(){
        System.out.println("Enter the amount you wish to deposit:");
        System.out.println("**********************************************");
        scanner = new Scanner(System.in);
        double value;

        if (scanner.hasNextDouble()){
            value = Double.parseDouble(scanner.nextLine());
            System.out.println("\n" + "$" + value + " successfully deposited");
            previousTransaction = "Previous balance was: $" + balance + "\n" 
                                    + "$" + value + " was deposited";
            balance = balance + value;
            System.out.println("**********************************************");
        }
        else{
            System.out.println("User input requires an number value" + "\n");
            deposit();
        }
    }

    private void withdraw(){
        System.out.println("Enter the amount you wish to withdraw");
        System.out.println("**********************************************");
        scanner = new Scanner(System.in);
        double value;

        if(balance > 0){
            if (scanner.hasNextDouble()){
                value = Double.parseDouble(scanner.nextLine());
                System.out.println("\n" + "$" + value + " successfully withdrawn");
                previousTransaction = "Previous balance was: $" + balance + "\n" 
                                        + "$" + value + " was withdrawn";
                balance = balance - value;
                System.out.println("**********************************************");
            }
            else{
                System.out.println("User input requires an number value" + "\n");
                withdraw();
            }
        }else{
            System.out.println("Account balance is $0.00");
        }
    }

    private void history(){
        if (previousTransaction != "-"){
            System.out.println(previousTransaction);
            System.out.println("**********************************************");
        }else{
            System.out.println("No previous transaction has been made");
            System.out.println("**********************************************");
        }

        
    }
}
