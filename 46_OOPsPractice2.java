/* 
Bank Account
Beginner
Concepts: Objects, fields, methods, object state
Requirements:
- Create a class named BankAccount.
- Include accountHolder, accountNumber, and balance.
- Create a method deposit(double amount) to add money.
- Create a method withdraw(double amount) to subtract money.
- Prevent withdrawals when the amount exceeds the balance.
- Create an account object and test depositing and withdrawing.
Goal: Learn how methods change an object's data.
*/
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance; 
    }
    public void deposit(double money) {
        if(money <= 0) {
            System.out.println("Deposit must be positive");
            return;
        }
        double oldBalance = this.balance;
        this.balance += money;  

        System.out.println("Your old balance: + oldBalance ");
        System.out.println("Your new balance: + this.balance");
    }
    public double withdraw(double money) {
        if(money <= 0) {
            System.out.println("Withdrawal amount must be positive");
            return -1;
        }
        double currentBalance = this.balance;

        if(currentBalance >= money) {
            this.balance -= money;

            System.out.println("Your old balance: " + currentBalance);
            Syatem.out.println("Your new balance: " + this.balance);

            return money;
        } else {
            System.out.println("Insufficient balance");
            return -1; 
        }
    }
}
class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Pavani", "26A81A05E5", 1000);

        account.deposit(500);
        System.out.println();

        double moneyWithdraw = account.withdraw(200);

        if(moneyWithdraw != -1) {
            System.out.println("Successfully withdrawn" + moneyWithdraw);
        } else {
            System.out.println("Please check your balance");
        }
        System.out.println();

        moneyWithdraw = account.withdraw(1700);

        if(moneyWithdraw != -1) {
            System.out.println("Successfully withdrawn" + moneyWithdrawn); 
        } else {
            System.out.println("Please check your balance");
        }
        System.out.println();
    }
}