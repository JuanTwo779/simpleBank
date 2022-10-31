import java.util.Scanner;

public class Account {

    private String name;
    private String accNum;
    private int balance;
    Scanner scanner;

    public Account (String name, String accNum){
        balance = 0;
        this.name = name;
        this.accNum = accNum;
    }

    private void menu(){
        char choice = '\0';
        boolean flag = true;
        //scanner = new Scanner(System.in);
        System.out.println("Welcome " + name);
        System.out.println("Your account number is: " + accNum + "\n");
        System.out.println("What would you like to do?" + "\n");
        System.out.println("A. Show balance" + "\n" + "B. Deposit money" + "\n" +
                "C. Withdraw money" + "\n" + "D. View previous transaction" + "\n" +
                "E. Exit" + "\n");

        do {
            System.out.println("Enter an option: ");
            choice = scanner.next().charAt(0);
            choice = Character.toUpperCase(choice);
            if (choice == 'A'){
                balance();
            } else if (choice == 'B') {

            } else if (choice == 'C') {

            } else if (choice == 'D') {

            } else if (choice == 'E') {
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
        System.out.println("Enter the amount you wish to deposit:");
        boolean flag = true;
        int value;
        value = Integer.parseInt(scanner.nextLine());

        while (flag){
            if (value )
        }

        balance = balance + value;

    }
}
