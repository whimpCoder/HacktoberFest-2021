import java.util.Random;
import java.util.Scanner;

public class AdvancedApp {
    public static void main(String[] args) {
        // main is the name of my method
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("WEKCOME");
        System.out.println("Please enter your AccountNUmber");
        long accoutnNumber = scanner.nextLong();

        System.out.println("Please Enter Your Password");
        int passWord = scanner.nextInt();

        System.out.println("Press 1 for Checking AccountBalance,Checking SavingsAccount,Checking FixedDeposit");
        System.out.println("Press 2 to Withdraw Cash or Deposit  Cash");
        int AccountBalance = random.nextInt(4654668);

        byte firstInput = scanner.nextByte();
        switch (firstInput) {
            case 1:

                System.out.println("Your AccountBalance is : " + "$" + AccountBalance);
                int SavingsAccount = random.nextInt(6445656);
                System.out.println("Your Savings are : " + "$" + SavingsAccount);
                int FixedDeposit = random.nextInt();
                System.out.println("Fixed Deposit Amount is : " + "$" + FixedDeposit);
                break;
            case 2:
                System.out.println("Press 1 for Withdraw or 2 for Deposit ");
                byte secondInput = scanner.nextByte();
                switch (secondInput) {
                    case 1:
                        System.out.println("Please enter the Amount you want to Withdraw");
                        int WithDrawAmount = scanner.nextInt();
                        if (AccountBalance > WithDrawAmount) {
                            int remainingBalance = AccountBalance - WithDrawAmount;
                            System.out.println("You Have Sucessfully WithdrawenedAmount of " + WithDrawAmount);
                            System.out.println("AccountBalance = " + remainingBalance);
                        } else {
                            System.out.println("Sorry! Your AccountBalance is not that much ");
                        }
                        break;
                    case 2:
                        System.out.println("Please enter the amount you want to Deposit");
                        int DepositAmount = scanner.nextInt();
                        if (AccountBalance > DepositAmount) {
                            int remain = AccountBalance + DepositAmount;
                            System.out.println("You Have Sucessfully DepositedAmount of " + DepositAmount);
                            System.out.println("AccountBalance = " + remain);
                        }
                        break;

                    default:
                        break;
                }
                break;

            default:
                break;
        }
        System.out.println("Please Tell Your FeedBack");
        System.out.println(" 1 for Good , 2 for very Good , 3 for Bad  ");
        byte feedBack = scanner.nextByte();
        switch (feedBack) {
            case 1:
                System.out.println("THANK YOU , PLEASE VISIT SOON");
                break;
            case 2:
                System.out.println("THANK YOU , WE WILL ALWAYS BE PLEASURE AT YOUR VISTI");
                break;
            case 3:
                System.out.println("THANK YOU , We will try to improve");
                break;

            default:
                break;
        }

    }
}
