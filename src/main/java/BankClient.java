import java.time.LocalTime;
import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        System.out.println(name);
        BankAccount newBank = new BankAccount(name);
        LocalTime time = LocalTime.now();
        System.out.println("Hello "+newBank.getPreferredName()+". The time is "+time+". Yes those are a lot of milliseconds.");
        while(true) {
            System.out.println("Use keywords: withdraw/deposit/check balance/check account number/set preferred name/get preferred name/withdrawal history/end session to access your account.");
            String input = scan.nextLine();
            if (input.equals("withdraw")) {
                System.out.println("How much?");
                String money = scan.nextLine();
                int withdrawals = Integer.parseInt(money);
                newBank.withdraw(withdrawals);
            }
            else if (input.equals("deposit")) {
                System.out.println("How much?");
                String money = scan.nextLine();
                int deposits = Integer.parseInt(money);
                newBank.deposit(deposits);
                System.out.println("You deposited $"+deposits+".");
            }
            else if (input.equals("check balance")) {
                System.out.println(newBank.getBalance());
            }
            else if (input.equals("check account number")) {
                System.out.println(newBank.getAccountNumber());
            }
            else if (input.equals("check preferred name")) {
                System.out.println(newBank.getPreferredName());
            }
            else if (input.equals("set preferred name")) {
                System.out.println("What would like to change your preferred name to?");
                String newName = scan.nextLine();
                newBank.setPreferredName(newName);
            }
            else if (input.equals("withdrawal history")) {
                newBank.withdrawalHistory();
            }
            else if (input.equals("end session")) {
                break;
            }
            else
                System.out.println("You have entered something invalid.");
        }
    }
}
