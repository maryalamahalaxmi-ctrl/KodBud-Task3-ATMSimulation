import java.util.Scanner;

public class ATMSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000.0;
        double deposit, withdraw;
        int choice;

        System.out.println("==================================");
        System.out.println("         ATM SIMULATION");
        System.out.println("==================================");

        while (true) {

            System.out.println("\nATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nCurrent Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("\nEnter Deposit Amount: ₹");
                    deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Amount Deposited Successfully!");
                        System.out.println("Updated Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid Deposit Amount!");
                    }
                    break;

                case 3:
                    System.out.print("\nEnter Withdrawal Amount: ₹");
                    withdraw = sc.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    }
                    else if (withdraw <= 0) {
                        System.out.println("Invalid Withdrawal Amount!");
                    }
                    else {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance: ₹" + balance);
                    }
                    break;

                case 4:
                    System.out.println("\nThank You for Using ATM!");
                    System.out.println("Visit Again!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid Choice! Please Try Again.");
            }
        }
    }
}